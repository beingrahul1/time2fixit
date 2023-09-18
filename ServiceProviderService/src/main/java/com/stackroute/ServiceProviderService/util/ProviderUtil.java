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
    public static Supplier<Query> supplierWithserviceProduct(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.match(matchQueryWithserviceProduct(query)));
        return supplier;
    }

    public static MatchQuery matchQueryWithserviceProduct(String query){
        val  matchQuery = new MatchQuery.Builder();
        return matchQuery.field("serviceProduct").query(query).build();
    }

    public static Supplier<Query> supplierWithproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.match(matchQueryWithproductBrand (query)));
        return supplier;
    }

    public static MatchQuery matchQueryWithproductBrand(String query){
        val  matchQuery = new MatchQuery.Builder();
        return matchQuery.field("productBrand").query(query).build();
    }
    public static Supplier<Query> supplierWithaddress(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.match(matchQueryWithaddress (query)));
        return supplier;
    }

    public static MatchQuery matchQueryWithaddress(String query){
        val  matchQuery = new MatchQuery.Builder();
        return matchQuery.field("address").query(query).build();
    }
    public static Supplier<Query> supplierWithshopname(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.match(matchQueryWithshopname (query)));
        return supplier;
    }

    public static MatchQuery matchQueryWithshopname(String query){
        val  matchQuery = new MatchQuery.Builder();
        return matchQuery.field("shopname").query(query).build();
    }
    public static Supplier<Query> supplierWithshopownername(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.match(matchQueryWithshopownername (query)));
        return supplier;
    }

    public static MatchQuery matchQueryWithshopownername(String query){
        val  matchQuery = new MatchQuery.Builder();
        return matchQuery.field("shopownername").query(query).build();
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
    public static Supplier<Query> supplierWithshopnameAndshopownernameAndaddress(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndshopownernameAndaddress(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndshopownernameAndaddress(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "shopownername", "address").query(query).build();}

public static Supplier<Query> supplierWithshopnameAndshopownernameAndserviceProduct(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndshopownernameAndserviceProduct(query)));
        return supplier;
    }
public static MultiMatchQuery multiMatchQuerywithhopnameAndshopownernameAndserviceProduct(String query) {
    val  matchQuery = new MultiMatchQuery.Builder();
    return matchQuery.fields("shopname", "shopownername", "serviceProduct").query(query).build();}
public static Supplier<Query> supplierWithshopownernameAndaddressAndproductBrand(String query){
    Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopownernameAndaddressAndproductBrand(query)));
    return supplier;
}

public static MultiMatchQuery multiMatchQuerywithshopownernameAndaddressAndproductBrand(String query) {
    val  matchQuery = new MultiMatchQuery.Builder();
    return matchQuery.fields("shopownername", "address", "productBrand").query(query).build();}



public static MultiMatchQuery multiMatchQuerywithshopnameAndshopownernameAndserviceProduct(String query) {
    val  matchQuery = new MultiMatchQuery.Builder();
    return matchQuery.fields("shopname", "shopownername", "serviceProduct").query(query).build();}

public static Supplier<Query> supplierWithshopnameAndshopownernameAndproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndshopownernameAndproductBrand(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndshopownernameAndproductBrand(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "shopownername", "productBrand").query(query).build();}
    
    public static Supplier<Query> supplierWithshopnameAndaddressAndproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndaddressAndproductBrand(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndaddressAndproductBrand(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "address", "productBrand").query(query).build();}
    public static Supplier<Query> supplierWithshopnameAndaddressAndserviceProduct(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndaddressAndserviceProduct(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndaddressAndserviceProduct(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "address", "serviceProduct").query(query).build();}
    public static Supplier<Query> supplierWithshopnameAndserviceProductAndproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndserviceProductAndproductBrand(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndserviceProductAndproductBrand(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "serviceProduct", "productBrand"
).query(query).build();}
    
    public static Supplier<Query> supplierWithaddressAndserviceProductAndproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithaddressAndserviceProductAndproductBrand(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithaddressAndserviceProductAndproductBrand(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("address", "serviceProduct", "productBrand").query(query).build();}
    
    public static Supplier<Query> supplierWithshopownernameAndaddressAndserviceProduct(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopownernameAndaddressAndserviceProduct(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopownernameAndaddressAndserviceProduct(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopownername", "address", "serviceProduct").query(query).build();}
    public static Supplier<Query> supplierWithshopownernameAndserviceProductAndproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopownernameAndserviceProductAndproductBrand(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopownernameAndserviceProductAndproductBrand(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopownername", "serviceProduct", "productBrand").query(query).build();}


    public static Supplier<Query> supplierWithshopnameAndshopownernameAndaddressAndserviceProduct(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndshopownernameAndaddressAndserviceProduct(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndshopownernameAndaddressAndserviceProduct(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "shopownername", "address", "productBrand").query(query).build();}


    

    public static Supplier<Query> supplierWithshopnameAndshopownernameAndaddressAndproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndshopownernameAndaddressAndproductBrand(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndshopownernameAndaddressAndproductBrand(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "shopownername", "address", "productBrand").query(query).build();}





    public static Supplier<Query> supplierWithshopnameAndshopownernameAndserviceProductAndproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndshopownernameAndserviceProductAndproductBrand(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndshopownernameAndserviceProductAndproductBrand(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopname", "shopownername", "serviceProduct", "productBrand").query(query).build();}


    public static Supplier<Query> supplierWithshopnameAndaddressAndserviceProductAndproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopnameAndaddressAndserviceProductAndproductBrand(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopnameAndaddressAndserviceProductAndproductBrand(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopownername", "address", "serviceProduct", "productBrand").query(query).build();}


    public static Supplier<Query> supplierWithshopownernameAndaddressAndserviceProductAndproductBrand(String query){
        Supplier<Query> supplier = ()->Query.of(q->q.multiMatch(multiMatchQuerywithshopownernameAndaddressAndserviceProductAndproductBrand(query)));
        return supplier;
    }

    public static MultiMatchQuery multiMatchQuerywithshopownernameAndaddressAndserviceProductAndproductBrand(String query) {
        val  matchQuery = new MultiMatchQuery.Builder();
        return matchQuery.fields("shopownername", "address", "serviceProduct", "productBrand").query(query).build();}




}