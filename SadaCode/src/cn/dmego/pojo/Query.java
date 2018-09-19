package cn.dmego.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.LinkedMap;

public class Query {
	
	    private String id;
	    private String key;	   
	    private String countStr;	  
	    private String tableName;
	    private String className;	 
	    private Integer pagesize;	
	    private Integer pagesInGrp;
	    private Integer splitAt;	
	    private String widthType;	
	    private Boolean allowPaging;	
	    private String filter;
	    private String order;
	    private Boolean enableMultiline;
	    // 排序主键 解决分页数据重复问题 2014-3-15
	    private String sortKey;
	    // 数据权限是否存在数据库（即服务器端过滤条件）
	    private Boolean isServerFilter;
	    private Boolean enableMultiHeader;
	    /**
	     * 为了越过框架获取结果集，去掉用自己实现的结果集
	     */
	    // 是否沿用原来的框架提供的查询默认是true
	    private Boolean simpleSearch;
	    // 仅在simpleSearch设置false时生效，提供的回调service
	    private String service;
	    // 仅在simpleSearch设置false时生效，提供回调的method
	    private String method;
	    /**
	     * sql 扩展 ，支持复杂查询
	     */
	    private String sql;
	    private String varSql;
	    private Integer startRow;
	    private List<LinkedMap<String, Object>> column;
	    private List<Column> columnList;
	    private Map<String, Column> columnMap;
	    public Query() {

	        pagesize = 10;
	        pagesInGrp = 5;
	        key = "id";
	        columnList = new ArrayList<Column>();
	        columnMap = new HashMap<String, Column>();
	        widthType = "px";
	        allowPaging = true;
	        enableMultiline = true;
	        countStr = "count(*)";
	        isServerFilter = false;
	        enableMultiHeader = false;
	        simpleSearch = true;
	        startRow = 1;
	    }
	   
		public List<LinkedMap<String, Object>> getColumn() {
			return column;
		}

		public void setColumn(List<LinkedMap<String, Object>> column) {
			this.column = column;
		}

		

	    public Boolean getIsServerFilter() {

	        return isServerFilter;
	    }

	    public void setIsServerFilter(Boolean isServerFilter) {

	        this.isServerFilter = isServerFilter;
	    }

	    public String getCountStr() {

	        return countStr;
	    }

	    public void setCountStr(String countStr) {

	        this.countStr = countStr;
	    }

	    public void addColumn(Column queryColumn) {

	        columnList.add(queryColumn);
	        columnMap.put(queryColumn.getId() != null ? queryColumn.getId() : queryColumn.getKey(), queryColumn);
	    }

	    public String getId() {

	        return id;
	    }

	    public void setId(String id) {

	        this.id = id;
	    }

	    public String getKey() {

	        return key;
	    }

	    public void setKey(String key) {

	        this.key = key;
	    }

	    public String getTableName() {

	        return tableName;
	    }

	    public void setTableName(String tableName) {

	        this.tableName = tableName;
	    }

	    public String getClassName() {

	        return className;
	    }

	    public void setClassName(String className) {

	        this.className = className;
	    }

	    public Integer getPagesize() {

	        return pagesize;
	    }

	    public void setPagesize(Integer pagesize) {

	        this.pagesize = pagesize;
	    }

	    public Integer getPagesInGrp() {

	        return pagesInGrp;
	    }

	    public void setPagesInGrp(Integer pagesInGrp) {

	        this.pagesInGrp = pagesInGrp;
	    }

	    public Integer getSplitAt() {

	        return splitAt;
	    }

	    public void setSplitAt(Integer splitAt) {

	        this.splitAt = splitAt;
	    }

	    public String getWidthType() {

	        return widthType;
	    }

	    public void setWidthType(String widthType) {

	        this.widthType = widthType;
	    }

	    public Boolean getAllowPaging() {

	        return allowPaging;
	    }

	    public void setAllowPaging(Boolean allowPaging) {

	        this.allowPaging = allowPaging;
	    }

	    public String getFilter() {

	        return filter;
	    }

	    public void setFilter(String filter) {

	        this.filter = filter;
	    }

	    public String getOrder() {

	        return order;
	    }

	    public void setOrder(String order) {

	        this.order = order;
	    }

	    public List<Column> getColumnList() {

	        return columnList;
	    }

	    public Map<String, Column> getColumnMap() {

	        return columnMap;
	    }

	    public Column getColumn(String key) {

	        return (Column) columnMap.get(key);
	    }

	    public void setColumnList(List<Column> columnList) {

	        this.columnList = columnList;
	    }

	    public void setColumnMap(Map<String, Column> columnMap) {

	        this.columnMap = columnMap;
	    }

	    public Boolean getEnableMultiline() {

	        return enableMultiline;
	    }

	    public void setEnableMultiline(Boolean enableMultiline) {

	        this.enableMultiline = enableMultiline;
	    }

	    public String getSql() {

	        return sql;
	    }

	    public void setSql(String sql) {

	        this.sql = sql;
	    }

	    public String getVarSql() {

	        return varSql;
	    }

	    public void setVarSql(String varSql) {

	        this.varSql = varSql;
	    }

	    public String getSortKey() {

	        return sortKey;
	    }

	    public void setSortKey(String sortKey) {

	        this.sortKey = sortKey;
	    }

	    public Boolean getEnableMultiHeader() {

	        return enableMultiHeader;
	    }

	    public void setEnableMultiHeader(Boolean enableMultiHeader) {

	        this.enableMultiHeader = enableMultiHeader;
	    }

	    public Boolean getSimpleSearch() {

	        return simpleSearch;
	    }

	    public void setSimpleSearch(Boolean simpleSearch) {

	        this.simpleSearch = simpleSearch;
	    }

	    public String getService() {

	        return service;
	    }

	    public void setService(String service) {

	        this.service = service;
	    }

	    public String getMethod() {

	        return method;
	    }

	    public void setMethod(String method) {

	        this.method = method;
	    }

	    public Integer getStartRow() {

	        return startRow;
	    }

	    public void setStartRow(Integer startRow) {

	        this.startRow = startRow;
	    }

	    
	    
}