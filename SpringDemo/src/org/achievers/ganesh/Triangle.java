package org.achievers.ganesh;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape,ApplicationContextAware,BeanNameAware {

		//primitive initialization
		/*private String type;
		private int height;
		public Triangle(String type) {
			this.type=type;
		}
		public Triangle(String type,int height) {
			this.type=type;
			this.height=height;
		}

		public int getHeight() {
			return height;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
*/		
	//Object initialization
	private Point p1;
	private Point p2;
	private Point p3;
	private ApplicationContext context;
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Point getP3() {
		return p3;
	}
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	
	private List<Point> pList;
	public List<Point> getpList() {
		return pList;
	}
	public void setpList(List<Point> pList) {
		this.pList = pList;
	}
	public void draw() {
		/*for(Point p:pList) {
			System.out.println("Point1 :"+p.getX()+","+p.getY());
		}*/
		System.out.println("Drawing Triangle :");
		System.out.println("Point1 :"+getP1().getX()+","+getP1().getY());
		System.out.println("Point2 :"+getP2().getX()+","+getP2().getY());
		System.out.println("Point3 :"+getP3().getX()+","+getP3().getY());
		
	}
	@Override
	public void setBeanName(String context) {
		System.out.println("Bean Name : "+context);
	}
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
	}
	/*@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing beans");	
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destry  beans method" );	
	}*/
	
	/*public void myInit() {
		System.out.println("My init method..............." );
	}
	public void myDestroy() {
		System.out.println("My Destroy method..............." );
	}*/
}
