package com.examples.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class RoutingDataStore extends AbstractRoutingDataSource {
	@Override
	protected Object determineCurrentLookupKey() {
		return QueryContextRouter.getDatasource();
	}
}
