Ext.onReady(function() {
			var store = new Ext.data.Store({
						proxy : new Ext.data.HttpProxy({
									url : '/spreader-front/clientreport/data?_time='
											+ new Date().getTime()
								}),
						reader : new Ext.data.JsonReader({
									totalProperty : 'totalCount',
									root : 'list'
								}, [{
											name : 'clientId'
										}, {
											name : 'taskType'
										}, {
											name : 'taskDate'
										}, {
											name : 'clientSeq'
										}, {
											name : 'updateTime'
										}, {
											name : 'createTime'
										}, {
											name : 'expectCount'
										}, {
											name : 'actualCount'
										}, {
											name : 'successCount'
										}, {
											name : 'actionId'
										}, {
											name : 'appName'
										}]),
						// remoteSort : true,
						autoLoad : true
					});
			// 页数
			var number = 20;
			var numtext = new Ext.form.TextField({
						id : 'maxpage',
						name : 'maxpage',
						width : 60,
						emptyText : '每页条数',
						// 激活键盘事件
						enableKeyEvents : true,
						listeners : {
							specialKey : function(field, e) {
								if (e.getKey() == Ext.EventObject.ENTER) {// 响应回车
									bbar.pageSize = Number(numtext.getValue());
									number = Number(numtext.getValue());
									store.reload({
												params : {
													start : 0,
													limit : bbar.pageSize
												}
											});
								}
							}
						}
					});

			// 分页带上查询条件
			store.on('beforeload', function() {
						var dateCmp = Ext.getCmp('taskDate');
						var clientIdCmp = Ext.getCmp('clientId');
						var actionIdCmp = Ext.getCmp('actionId');
						var appNameCmp = Ext.getCmp('appName');
						var taskDate = dateCmp.getValue();
						var clientId = clientIdCmp.getValue();
						var actionId = actionIdCmp.getValue();
						var appName = appNameCmp.getValue();
						this.baseParams = {
							clientId : clientId,
							taskDate : taskDate,
							actionId : actionId,
							appName : appName
						};
					});
			var sm = new Ext.grid.CheckboxSelectionModel();
			var rownums = new Ext.grid.RowNumberer({
						header : 'NO',
						locked : true
					});

			var cm = new Ext.grid.ColumnModel([rownums, sm, {
						header : '客户端ID',
						dataIndex : 'clientId',
						sortable : true,
						width : 120
					}, {
						header : 'ActionId',
						dataIndex : 'actionId',
						sortable : true,
						width : 120
					}, {
						header : 'AppName',
						dataIndex : 'appName',
						sortable : true,
						width : 120
					}, {
						header : '执行数量',
						dataIndex : 'actualCount',
						sortable : true,
						width : 150
					}, {
						header : '计划数量',
						dataIndex : 'expectCount',
						sortable : true,
						width : 150
					}, {
						header : '成功数',
						dataIndex : 'successCount',
						sortable : true,
						width : 150
					}, {
						header : '任务日期',
						dataIndex : 'taskDate',
						sortable : true,
						renderer : renderDate,
						width : 200
					}, {
						header : '任务批次',
						dataIndex : 'clientSeq',
						sortable : true,
						width : 200
					}, {
						header : '更新时间',
						dataIndex : 'updateTime',
						sortable : true,
						renderer : renderDateHis,
						width : 200
					}, {
						header : '创建时间',
						dataIndex : 'createTime',
						sortable : true,
						renderer : renderDateHis,
						width : 200
					}]);
			// // 分页菜单
			var bbar = new Ext.PagingToolbar({
						pageSize : number,
						store : store,
						displayInfo : true,
						displayMsg : '显示{0}条到{1}条,共{2}条',
						emptyMsg : "没有符合条件的记录",
						plugins : new Ext.ux.ProgressBarPager(),
						items : ['-', '&nbsp;&nbsp;', numtext]
					});

			// 定义grid表格
			var grid = new Ext.grid.GridPanel({
						title : 'ClientReport',
						id : 'grid',
						region : 'center',
						split : true,
						stripeRows : true, // 斑马线
						frame : true,
						store : store,
						loadMask : {
							msg : '正在加载表格数据,请稍等...'
						},
						bbar : bbar,
						sm : sm,
						cm : cm,
						tbar : [{
									xtype : "datefield",
									fieldLabel : "创建时间",
									emptyText : '请输入任务日期',
									id : 'taskDate',
									name : 'taskDate',
									width : 150
								}, new Ext.form.TextField({
											id : 'clientId',
											name : 'clientId',
											emptyText : '请输入客户端ID',
											width : 130
										}), '-', new Ext.form.TextField({
											id : 'actionId',
											name : 'actionId',
											emptyText : '请输入ActionId',
											width : 130
										}), '-', new Ext.form.TextField({
											id : 'appName',
											emptyText : '请输入AppName',
											width : 130
										}), '-', {
									text : '查询',
									iconCls : 'previewIcon',
									handler : function() {
										var dateCmp = Ext.getCmp('taskDate');
										var clientIdCmp = Ext
												.getCmp('clientId');
										var actionIdCmp = Ext
												.getCmp('actionId');
										var appNameCmp = Ext.getCmp('appName');
										var taskDate = dateCmp.getValue();
										var clientId = clientIdCmp.getValue();
										var actionId = actionIdCmp.getValue();
										var appName = appNameCmp.getValue();
										store
												.setBaseParam('taskDate',
														taskDate);
										store
												.setBaseParam('clientId',
														clientId);
										store
												.setBaseParam('actionId',
														actionId);
										store.setBaseParam('appName', appName);
										store.load();
									}
								}]
					});
			var viewport = new Ext.Viewport({
						layout : 'border',
						items : [grid]
					});
		});