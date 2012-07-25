package com.nali.spreader.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.nali.common.model.BaseModel;

public class Content extends BaseModel implements Serializable {

    private static final long serialVersionUID = -29631703474189657L;

    public static final Integer TYPE_WEIBO = 1;

    /**
	 * 默认页数
	 */
    public static final Integer DEFAULT_PAGENUMBER = 5;

    /**
	 * ‘@’符号
	 */
    public static final String AT_STR = "@";

    /**
	 * 用户昵称
	 */
    private String nickName;

    /**
	 * 网站名称
	 */
    private String webSiteName;

    private String typeName;

    private List<String> tags;
    
	/**
	 * 引用的微博
	 */
	private Content refContent;

	public Content getRefContent() {
		return refContent;
	}

	public void setRefContent(Content refContent) {
		this.refContent = refContent;
	}

	public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getWebSiteName() {
        return webSiteName;
    }

    public void setWebSiteName(String webSiteName) {
        this.webSiteName = webSiteName;
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.type
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Integer type;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.website_id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Integer websiteId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.website_content_id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Long websiteContentId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.website_ref_id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Long websiteRefId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.website_uid
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Long websiteUid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.uid
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Long uid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.title
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private String title;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.pub_date
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Date pubDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.sync_date
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Date syncDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.ref_count
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Integer refCount;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.reply_count
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Integer replyCount;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.entry
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private String entry;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.score
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private BigDecimal score;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.pic_url
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private String picUrl;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.video_url
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private String videoUrl;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.audio_url
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private String audioUrl;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.at_count
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Integer atCount;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.content_length
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Integer contentLength;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.ref_id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private Long refId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_content.content
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    private String content;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.id
     *
     * @return the value of spreader.tb_content.id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.id
     *
     * @param id the value for spreader.tb_content.id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.type
     *
     * @return the value of spreader.tb_content.type
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.type
     *
     * @param type the value for spreader.tb_content.type
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.website_id
     *
     * @return the value of spreader.tb_content.website_id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Integer getWebsiteId() {
        return websiteId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.website_id
     *
     * @param websiteId the value for spreader.tb_content.website_id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.website_content_id
     *
     * @return the value of spreader.tb_content.website_content_id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Long getWebsiteContentId() {
        return websiteContentId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.website_content_id
     *
     * @param websiteContentId the value for spreader.tb_content.website_content_id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setWebsiteContentId(Long websiteContentId) {
        this.websiteContentId = websiteContentId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.website_ref_id
     *
     * @return the value of spreader.tb_content.website_ref_id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Long getWebsiteRefId() {
        return websiteRefId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.website_ref_id
     *
     * @param websiteRefId the value for spreader.tb_content.website_ref_id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setWebsiteRefId(Long websiteRefId) {
        this.websiteRefId = websiteRefId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.website_uid
     *
     * @return the value of spreader.tb_content.website_uid
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Long getWebsiteUid() {
        return websiteUid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.website_uid
     *
     * @param websiteUid the value for spreader.tb_content.website_uid
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setWebsiteUid(Long websiteUid) {
        this.websiteUid = websiteUid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.uid
     *
     * @return the value of spreader.tb_content.uid
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.uid
     *
     * @param uid the value for spreader.tb_content.uid
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.title
     *
     * @return the value of spreader.tb_content.title
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.title
     *
     * @param title the value for spreader.tb_content.title
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.pub_date
     *
     * @return the value of spreader.tb_content.pub_date
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Date getPubDate() {
        return pubDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.pub_date
     *
     * @param pubDate the value for spreader.tb_content.pub_date
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.sync_date
     *
     * @return the value of spreader.tb_content.sync_date
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Date getSyncDate() {
        return syncDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.sync_date
     *
     * @param syncDate the value for spreader.tb_content.sync_date
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setSyncDate(Date syncDate) {
        this.syncDate = syncDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.ref_count
     *
     * @return the value of spreader.tb_content.ref_count
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Integer getRefCount() {
        return refCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.ref_count
     *
     * @param refCount the value for spreader.tb_content.ref_count
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setRefCount(Integer refCount) {
        this.refCount = refCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.reply_count
     *
     * @return the value of spreader.tb_content.reply_count
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Integer getReplyCount() {
        return replyCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.reply_count
     *
     * @param replyCount the value for spreader.tb_content.reply_count
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.entry
     *
     * @return the value of spreader.tb_content.entry
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public String getEntry() {
        return entry;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.entry
     *
     * @param entry the value for spreader.tb_content.entry
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setEntry(String entry) {
        this.entry = entry;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.score
     *
     * @return the value of spreader.tb_content.score
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.score
     *
     * @param score the value for spreader.tb_content.score
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.pic_url
     *
     * @return the value of spreader.tb_content.pic_url
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.pic_url
     *
     * @param picUrl the value for spreader.tb_content.pic_url
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.video_url
     *
     * @return the value of spreader.tb_content.video_url
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.video_url
     *
     * @param videoUrl the value for spreader.tb_content.video_url
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.audio_url
     *
     * @return the value of spreader.tb_content.audio_url
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public String getAudioUrl() {
        return audioUrl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.audio_url
     *
     * @param audioUrl the value for spreader.tb_content.audio_url
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.at_count
     *
     * @return the value of spreader.tb_content.at_count
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Integer getAtCount() {
        return atCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.at_count
     *
     * @param atCount the value for spreader.tb_content.at_count
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setAtCount(Integer atCount) {
        this.atCount = atCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.content_length
     *
     * @return the value of spreader.tb_content.content_length
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Integer getContentLength() {
        return contentLength;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.content_length
     *
     * @param contentLength the value for spreader.tb_content.content_length
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setContentLength(Integer contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.ref_id
     *
     * @return the value of spreader.tb_content.ref_id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public Long getRefId() {
        return refId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.ref_id
     *
     * @param refId the value for spreader.tb_content.ref_id
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setRefId(Long refId) {
        this.refId = refId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_content.content
     *
     * @return the value of spreader.tb_content.content
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_content.content
     *
     * @param content the value for spreader.tb_content.content
     *
     * @ibatorgenerated Mon Jul 02 13:56:17 CST 2012
     */
    public void setContent(String content) {
        this.content = content;
    }
}
