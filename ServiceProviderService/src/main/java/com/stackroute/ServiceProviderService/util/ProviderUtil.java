package com.stackroute.ServiceProviderService.util;

import co.elastic.clients.elasticsearch._types.query_dsl.MatchAllQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.MultiMatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.Operator;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.TextQueryType;
import lombok.val;

import java.util.function.Supplier;

public class ProviderUtil {
	
    public static Supplier<Query> supplier(){
        Supplier<Query> supplier = ()->Query.of(q->q.matchAll(matchAllQuery()));
        return supplier;
    }

    public static MatchAllQuery matchAllQuery(){
        val  matchAllQuery = new MatchAllQuery.Builder();
        return matchAllQuery.build();
    }


    public static Supplier<Query> supplierWithEmail(String email){
        Supplier<Query> supplier = ()->Query.of(q->q.match(matchQueryWithEmail(email)));
        return supplier;
    }

    public static MatchQuery matchQueryWithEmail(String email){
        val  matchQuery = new MatchQuery.Builder();
        return matchQuery.field("email").query(email).build();
    }
    public static Supplier<Query> supplierWithshopnameAndshopownrName(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithaddressAndserviceTypeAndshopownername(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithaddressAndserviceTypeAndshopownername(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("address", "serviceType","shopownername","contactnumber", "email", "shopname" ).query(query).build();
        
    }
    public static Supplier<Query> supplierWithAllFields(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuery(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuery(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("address", "serviceType","shopownername","contactnumber", "email", "shopname" ).query(query).build();
        
    }
    public static Supplier<Query> supplierWithshopnameAndshopownerName(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndshopownerName(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndshopownerName(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "shopownername").query(query).build();
        
    }
    public static Supplier<Query> supplierWithshopnameAndserviceType(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndserviceType(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndserviceType(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "serviceType").query(query).build();
        
    }
    public static Supplier<Query> supplierWithshopnameAndaddress(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndaddress(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndaddress(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "address").query(query).build();
        
    }
    public static Supplier<Query> supplierWithshopnameAndcontactnumber(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndcontactnumber(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndcontactnumber(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "contactnumber").query(query).build();
        
    }
    public static Supplier<Query> supplierWithshopnameAndemail(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndemail(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndemail(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "email").query(query).build();
        
    }
    public static Supplier<Query> supplierWithshopownernameserviceType(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopownernameserviceType(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopownernameserviceType(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopownername", "serviceType").query(query).build();
        
    }
    public static Supplier<Query> supplierWithshopownernameaddress(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopownernameaddress(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopownernameaddress(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopownername", "address").query(query).build();
        
    }
    public static Supplier<Query> supplierWithshopownernamecontactnumber(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopownernamecontactnumber(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopownernamecontactnumber(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopownername", "contactnumber").query(query).build();
        
    }
    public static Supplier<Query> supplierWithshopownernameemail(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopownernameemail(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopownernameemail(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopownername", "email").query(query).build();
        
    }
    public static Supplier<Query> supplierWithserviceTypeAndaddress(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithserviceTypeAndaddress(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithserviceTypeAndaddress(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("serviceType", "address").query(query).build();
        
    }
    public static Supplier<Query> supplierWithserviceTypeAndcontactnumber(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithserviceTypeAndcontactnumber(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithserviceTypeAndcontactnumber(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("serviceType", "contactnumber").query(query).build();
        
    }
    public static Supplier<Query> supplierWithserviceTypeAndemail(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithserviceTypeAndemail(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithserviceTypeAndemail(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("serviceType", "email").query(query).build();
        
    }
    public static Supplier<Query> supplierWithaddressAndcontactnumber(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithaddressAndcontactnumber(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithaddressAndcontactnumber(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("address", "contactnumber").query(query).build();
        
    }
    public static Supplier<Query> supplierWithaddressAndemail(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithaddressAndemail(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithaddressAndemail(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("address", "email").query(query).build();
        
    }
    public static Supplier<Query> supplierWithcontactnumberAndemail(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithcontactnumberAndemail(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithcontactnumberAndemail(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("contactnumber", "email").query(query).build();
        
    }

}
