package com.yes.moudle.springbootproperties.model;

import java.io.Serializable;

/**
 * @author yemingheng
 * @since 2020/2/10 17:14
 */
public class RankDO implements Serializable
{
	private static final long serialVersionUID = 4804922606006935590L;

	/**
	 * 排名
	 */
	private Long rank;

	/**
	 * 积分
	 */
	private Float score;

	/**
	 * 用户id
	 */
	private Long userId;


	public RankDO(Long rank, Float score, Long userId) {
		this.rank = rank;
		this.score = score;
		this.userId = userId;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
