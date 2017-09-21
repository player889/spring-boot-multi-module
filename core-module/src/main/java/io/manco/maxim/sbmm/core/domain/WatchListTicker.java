package io.manco.maxim.sbmm.core.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class WatchListTicker {

	@Id
	private String instId;
	
	@ManyToOne
    @JoinColumn(name = "watch_list_id")
	private WatchList watchList;

	public String getInstId() {
		return instId;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}

	public WatchList getWatchList() {
		return watchList;
	}

	public void setWatchList(WatchList watchList) {
		this.watchList = watchList;
	}

	@Override
	public String toString() {
		return "WatchListTicker [instId=" + instId + ", watchList=" + watchList + "]";
	}

}
