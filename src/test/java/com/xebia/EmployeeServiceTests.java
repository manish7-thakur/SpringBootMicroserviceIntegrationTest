package com.xebia;

import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class EmployeeServiceTests {
    @Test
    public void getEmployeesReturnsOK() throws Exception {
        Thread.sleep(20000);
        HttpResponse response = Request.Get("http://localhost:8080/spring-boot-microservice-1.0/api/employees").execute().returnResponse();
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
    }
}
