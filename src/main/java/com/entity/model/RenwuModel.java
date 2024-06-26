package com.entity.model;

import com.entity.RenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 任务
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class RenwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 发布人
     */
    private Integer yonghuId;


    /**
     * 任务名称
     */
    private String renwuName;


    /**
     * 任务类型
     */
    private Integer renwuTypes;


    /**
     * 附件
     */
    private String renwuFile;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 任务详情
     */
    private String newsContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：发布人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：发布人
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：任务名称
	 */
    public String getRenwuName() {
        return renwuName;
    }


    /**
	 * 设置：任务名称
	 */
    public void setRenwuName(String renwuName) {
        this.renwuName = renwuName;
    }
    /**
	 * 获取：任务类型
	 */
    public Integer getRenwuTypes() {
        return renwuTypes;
    }


    /**
	 * 设置：任务类型
	 */
    public void setRenwuTypes(Integer renwuTypes) {
        this.renwuTypes = renwuTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getRenwuFile() {
        return renwuFile;
    }


    /**
	 * 设置：附件
	 */
    public void setRenwuFile(String renwuFile) {
        this.renwuFile = renwuFile;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：任务详情
	 */
    public String getNewsContent() {
        return newsContent;
    }


    /**
	 * 设置：任务详情
	 */
    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
