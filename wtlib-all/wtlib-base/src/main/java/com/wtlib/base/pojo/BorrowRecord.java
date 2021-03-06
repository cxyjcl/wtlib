package com.wtlib.base.pojo;

import java.util.Date;

/**
 * 图书借阅实体
 * 
 * @author zongzi
 * @date 2017年1月21日 下午6:05:27
 */
public class BorrowRecord extends BaseEntity {
	private static final long serialVersionUID = -3738003781396004091L;

	private Integer id;

	private Integer bookSingleId;

	private Integer userId;

	private String borrowStatus;

	private Date borrowDeadLine;

	private Date returnTime;

	public BorrowRecord(){}

	public BorrowRecord(Integer bookSingleId, Integer userId, Date borrowDeadLine){
		this.bookSingleId = bookSingleId;
		this.userId = userId;
		this.borrowDeadLine = borrowDeadLine;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBookSingleId() {
		return bookSingleId;
	}

	public void setBookSingleId(Integer bookSingleId) {
		this.bookSingleId = bookSingleId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getBorrowStatus() {
		return borrowStatus;
	}

	public void setBorrowStatus(String borrowStatus) {
		this.borrowStatus = borrowStatus == null ? null : borrowStatus.trim();
	}

	public Date getBorrowDeadLine() {
		return borrowDeadLine;
	}

	public void setBorrowDeadLine(Date borrowDeadLine) {
		this.borrowDeadLine = borrowDeadLine;
	}

	public Date getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}

}