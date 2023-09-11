package com.stackroute.ServiceProviderService.util;

import co.elastic.clients.elasticsearch._types.query_dsl.MatchAllQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.MultiMatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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
    public static Supplier<Query> supplierWithaddressAndserviceTypeAndshopownername(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithaddressAndserviceTypeAndshopownername(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithaddressAndserviceTypeAndshopownername(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("address", "serviceType","shopownername").query(query).build();
        
    }
    public static Supplier<Query> supplierWithAllFields(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuery(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuery(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("address", "serviceProduct","productBrand","shopownername","contactnumber", "email", "shopname" ).query(query).build();
        
    }
    public static Supplier<Query> supplierWithshopnameAndshopownerName(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndshopownerName(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndshopownerName(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "shopownername").query(query).build();
        
    }
    public static Supplier<Query> supplierWithshopnameAndserviceProduct(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndserviceProduct(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndserviceProduct(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "serviceProduct").query(query).build();
        
    }
    public static Supplier<Query> supplierWithshopnameAndproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndproductBrand(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndproductBrand(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "productBrand").query(query).build();
        
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
    public static Supplier<Query> supplierWithshopownernameserviceProduct(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopownernameserviceProduct(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopownernameserviceProduct(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopownername", "serviceProduct").query(query).build();
        
    }
    
    public static Supplier<Query> supplierWithshopownernameAndproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopownernameAndproductBrand(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopownernameAndproductBrand(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopownername", "productBrand").query(query).build();
        
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
    public static Supplier<Query> supplierWithserviceProductAndaddress(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithserviceProductAndaddress(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithserviceProductAndaddress(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("serviceProduct", "address").query(query).build();
        
    }
    public static Supplier<Query> supplierWithproductBrandAndaddress(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithproductBrandAndaddress(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithproductBrandAndaddress(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("productBrand", "address").query(query).build();
        
    }
    
    public static Supplier<Query> supplierWithserviceProductAndcontactnumber(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithserviceProductAndcontactnumber(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithserviceProductAndcontactnumber(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("serviceProduct", "contactnumber").query(query).build();
        
    }
    public static Supplier<Query> supplierWithproductBrandAndcontactnumber(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithproductBrandAndcontactnumber(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithproductBrandAndcontactnumber(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("productBrand", "contactnumber").query(query).build();
        
    }
    public static Supplier<Query> supplierWithserviceProductAndemail(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithserviceProductAndemail(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithserviceProductAndemail(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("serviceProduct", "email").query(query).build();
        
    }
    public static Supplier<Query> supplierWithproductBrandAndemail(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithproductBrandAndemail(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithproductBrandAndemail(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("productBrand", "email").query(query).build();
        
    }
    public static Supplier<Query> supplierWithserviceProductAndproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithserviceProductAndproductBrand(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithserviceProductAndproductBrand(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("serviceProduct", "productBrand").query(query).build();
        
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
