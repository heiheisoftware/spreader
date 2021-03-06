/**
 * 策略树组件
 */
// 策略ID隐藏域
var strategyIdHidden = new Ext.form.Hidden({
			name : 'strategyIdHidden'
		});
// 策略对象ID隐藏域
var objIdHidden = new Ext.form.Hidden({
			name : 'objIdHidden'
		});
// 是否分组
var isGroupHidden = new Ext.form.Hidden({
			name : 'isGroupHidden'
		});
// 分组类型
var groupTypeHidden = new Ext.form.Hidden({
			name : 'groupTypeHidden'
		});
// 策略默认data
var defaultData = new Ext.form.Hidden({
			name : 'defaultData'
		});
// 消息ID
var noticeIdHidden = new Ext.form.Hidden({
			name : 'noticeHidden'
		});
// 构造树的根节点ROOT
var strategyRoot = new Ext.tree.AsyncTreeNode({
			id : '-1',
			text : '配置列表'
		});
// 策略列表树
var strategyTree = new Ext.tree.TreePanel({
	id : 'strategyTree',
	region : 'center',
	autoScroll : false,
	autoHeight : true,
	expanded : true,
	singleExpand : true,
	useArrows : true,
	rootVisible : true,
	root : strategyRoot,
	loader : new Ext.tree.TreeLoader({
		dataUrl : '../strategydisp/createdisptree?time=' + new Date().getTime(),
		processResponse : function(response, node, callback, scope) {
			var json = response.responseText;
			var respObj = Ext.util.JSON.decode(json);
			try {
				submitid = respObj.id;
				var o = [tranNodeConfig('data', respObj.treename, respObj.def,
						respObj.data)];
				settingTrigger(respObj.trigger);
				// var o = response.responseData ||
				// Ext.decode(json);
				node.beginUpdate();
				for (var i = 0, len = o.length; i < len; i++) {
					var n = this.createNode(o[i]);
					if (n) {
						node.appendChild(n);
					}
				}
				node.endUpdate();
				this.runCallback(callback, scope || node, [node]);
			} catch (e) {
				this.handleFailure(response);
			}
		},
		listeners : {
			"beforeload" : function(treeloader, node) {
				treeloader.baseParams = {
					name : strategyIdHidden.getValue(),
					id : objIdHidden.getValue(),
					isGroup : isGroupHidden.getValue(),
					defaultData : defaultData.getValue(),
					groupType : groupTypeHidden.getValue()
				};
			}
		}
	})
});
strategyTree.expand(true, true);
// 树形编辑器
//var treeEditor = new Ext.tree.TreeEditor(Ext.getCmp('strategyTree'), {
//			id : 'stgtreeEdit',
//			allowBlank : false
//		});
/**
 * 右键菜单相关代码
 */
// 给tree添加右键菜单事件
strategyTree.on('rightMenu', strategyTree.rightMenu, strategyTree);
// 定义右键菜单
var rightMenu = new Ext.menu.Menu({
			id : 'rightMenu',
			items : [{
						id : 'delNode',
						text : '删除',
						handler : function(tree) {
							dispatchDeleteNode(strategyTree);
						}
					}]
		});
// 添加点击事件
strategyTree.on('click', function(node) {
			if (node.id == -1) {
				return;
			}
			var isCollection = node.attributes.isCollection;
			if (isCollection) {
				collectionRender(node);
			} else {
				renderPropertyGrid(node);
			}
		});

// 增加右键弹出事件
strategyTree.on('contextmenu', function(node, event) {
			// 使用preventDefault方法可防止浏览器的默认事件操作发生
			event.preventDefault();
			node.select();
			rightMenu.showAt(event.getXY());// 取得鼠标点击坐标，展示菜单
		});
/**
 * 清空隐藏域内容
 */
function cleanHidden() {
	// 策略ID隐藏域
	strategyIdHidden.setValue(null);
	// 策略对象ID隐藏域
	objIdHidden.setValue(null);
	// 分组类型隐藏域
	groupTypeHidden.setValue(null);
	// 是否分组隐藏域
	isGroupHidden.setValue(null);
	// 消息ID
	noticeIdHidden.setValue(null);
	defaultData.setValue(null);
}