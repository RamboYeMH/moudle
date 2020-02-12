package com.yes.moudle.springbootproperties.controller;

import com.yes.moudle.springbootproperties.component.RankListComponent;
import com.yes.moudle.springbootproperties.model.RankDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yemingheng
 * @since 2020/2/10 17:14
 */
@RestController
public class RankAction
{
	@Autowired
	private RankListComponent rankListComponent;

	@GetMapping(path = "/topn")
	public List<RankDO> showTopN(int n) {
		return rankListComponent.getTopNRanks(n);
	}

	@GetMapping(path = "/update")
	public RankDO updateScore(long userId, float score) {
		return rankListComponent.updateRank(userId, score);
	}

	@GetMapping(path = "/rank")
	public RankDO queryRank(long userId) {
		return rankListComponent.getRank(userId);
	}

	@GetMapping(path = "/around")
	public List<RankDO> around(long userId, int n) {
		return rankListComponent.getRankAroundUser(userId, n);
	}

}
