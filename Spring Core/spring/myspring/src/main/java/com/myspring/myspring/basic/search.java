package com.myspring.myspring.basic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class search {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    sort quickSort;

    public void setMysort(sort mysort) {
        this.quickSort = mysort;
    }

    public int binarysearch(int []numbers, int numberToSearchFor){
        int[] number = quickSort.sort(numbers);
        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("post Construct");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("pre Destroy");
    }

    public void initIt() {
        System.out.println("Init method after properties are set : " + );
    }

    public void cleanUp()  {
        System.out.println("Spring Container is destroy! Customer clean up");
    }

}
