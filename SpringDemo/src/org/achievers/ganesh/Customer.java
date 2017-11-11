package org.achievers.ganesh;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Customer {
	
	private String ename;
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	private Set<Address> add;
	private Map<Integer,Address> add1;

	public Map<Integer, Address> getAdd1() {
		return add1;
	}

	public void setAdd1(Map<Integer, Address> add1) {
		this.add1 = add1;
	}

	public Set<Address> getAdd() {
		return add;
	}

	public void setAdd(Set<Address> add) {
		this.add = add;
	}
	
	public void getCust() {
		for(Address a : add) {
			System.out.println(getEname()+" : "+a.getCity()+" : "+a.getPin());
		}
		
	}
	Set<Entry<Integer, Address>> s= add1.entrySet();
	public void getCustMap() {
		for(Map.Entry<Integer, Address> entry:add1.entrySet()) {
			System.out.println(getEname()+" : "+entry.getKey()+" : "+entry.getValue());
		}
		
	}
}
