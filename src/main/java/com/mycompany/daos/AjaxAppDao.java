/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daos;


import com.mycompany.models.Country;
import com.mycompany.models.State;
import com.mycompany.models.University;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author samarth
 */
public class AjaxAppDao extends DAO{
    public Map<Integer , String> geCountriesMap(){
        //Session hsession = null;
        List<Country> countries = null;
        Map<Integer,String> countryMap = new HashMap();
        try{
            Criteria crit = getSession().createCriteria(Country.class);
            countries= crit.list();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        if(!countries.isEmpty())
        {
            for(Country cont : countries)
                countryMap.put(cont.getCountryId(),cont.getCountryName());
        }
        return countryMap;
    }
    
     public Map<Integer , String> geStateMap(int countryID ){
        //Session hsession = null;
        List<State> states = null;
        Map<Integer,String> stateMap = new HashMap();
        try{
            Criteria crit = getSession().createCriteria(State.class);
            crit.add(Restrictions.eq("countryID",countryID));
            states= crit.list();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        if(!states.isEmpty())
        {
            for(State cont : states)
                stateMap.put(cont.getStateId(),cont.getStateName());
        }
        return stateMap;
    }
}
