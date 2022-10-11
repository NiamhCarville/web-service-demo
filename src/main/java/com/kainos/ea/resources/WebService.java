package com.kainos.ea.resources;

import com.kainos.ea.dao.EmployeeDao;
import com.kainos.ea.model.Employee;
import io.swagger.annotations.Api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.sql.SQLException;
import java.util.Objects;

import static com.kainos.ea.db.DatabaseConnector.getConnection;

@Path("/api")
@Api("Engineering Academy Dropwizard API")
public class WebService {



    @GET
    @Path("/employee/{empID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMsg(@PathParam("empID") int empID) throws SQLException {

        EmployeeDao EmployeeDAO1 = new EmployeeDao();

        Employee EmployeeFinal = EmployeeDAO1.SelectEmployeeByID(empID, Objects.requireNonNull(getConnection()));

      return Response.ok(EmployeeFinal).build();

//  //msg can be Em/empID
//
////        Message myMessage = new Message("Hello from a RESTful Web service: " + message);
//        return Response
//                .status(Response.Status.OK)
//                .entity(myMessage)
//                .build();


        //read employee ID from path
        //GEt employee from DB
        //Map db fields to employee instance
        //return employee in response body

    }

    @POST
    @Path("/print/EmployeeDao/{empID}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response sendingEmpID(int empID) {

        return Response.ok(empID).build();


//        Message myMessage = new Message("Hello from a RESTful Web service: " + message);
//        return Response
//                .status(Response.Status.OK)
//                .entity(myMessage)
//                .build();

       // return "Hello from a RESTful Web service: " + message.getText();
    }

}

