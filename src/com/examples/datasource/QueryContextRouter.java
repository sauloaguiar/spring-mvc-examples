package com.examples.datasource;

public class QueryContextRouter {

	private static final ThreadLocal<Datasource> jpaContextHolder = new ThreadLocal<Datasource>();
	public static void setDatasource(Datasource datasource) {
		jpaContextHolder.set(datasource);
	}
	public static Datasource getDatasource() {
		//return jpaContextHolder.get();
		return Datasource.TESTE;
	}

}
