package com.sdl.pointTable.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class pointTable {
	@Id
	public ObjectId _id;
	
	public String Team_Name;
	public int Played;
	public int Won;
	public int Lost;
	public int Tied;
	public int Point;
	public double NRR;
	
	public pointTable() {}
	
	public pointTable(ObjectId _id, String team_Name, int played, int won, int lost, int tied, int point, double nRR) {
		this._id = _id;
		Team_Name = team_Name;
		Played = played;
		Won = won;
		Lost = lost;
		Tied = tied;
		Point = point;
		NRR = nRR;
	}
	
	
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getTeam_Name() {
		return Team_Name;
	}
	public void setTeam_Name(String team_Name) {
		Team_Name = team_Name;
	}
	public int getPlayed() {
		return Played;
	}
	public void setPlayed(int played) {
		Played = played;
	}
	public int getWon() {
		return Won;
	}
	public void setWon(int won) {
		Won = won;
	}
	public int getLost() {
		return Lost;
	}
	public void setLost(int lost) {
		Lost = lost;
	}
	public int getTied() {
		return Tied;
	}
	public void setTied(int tied) {
		Tied = tied;
	}
	public int getPoint() {
		return Point;
	}
	public void setPoint(int point) {
		Point = point;
	}
	public double getNRR() {
		return NRR;
	}
	public void setNRR(double nRR) {
		NRR = nRR;
	}
}
