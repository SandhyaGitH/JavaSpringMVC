<%-- 
    Document   : stuProfileCompletion3
    Created on : Apr 11, 2021, 3:21:11 PM
    Author     : samarth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <!DOCTYPE html>
    <html>
        <head>
            <title>Student Application Form</title>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
            <script src ="${pageContext.request.contextPath}/resources/static/js/jquery-1.7.1.min.js"></script>
            <script src ="./resources/static/js/app.js"></script>
            <script>
                $(document).ready(function(){
                    $('#comboBoxUniversity').change(function() {
                    var categoryId = $(this).val();
                    $ajax({
                        type:'GET',
                        url:'${pageContext.request.contextPath}/FinalProject_v1.0/loadProgramsByUniversity/' + categoryId,
                        success: function(result) {
                            var result = JSON.parse(result);
                             var p ='';
                             for(var i=0;i<result.length;i++)
                             {
                                 p+= '<option value="'+result[i].programID +'">' + result[i].programName + '</option>';
                             }
                             $('#comboboxProgram').html(p);
                        }
                       
                    });
                    });
                });
            </script>
            <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
            <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
            <style>
                html, body {
                    min-height: 100%;
                }
                body, div, form, input, select, textarea, label { 
                    padding: 0;
                    margin: 0;
                    outline: none;
                    font-family: Roboto, Arial, sans-serif;
                    font-size: 14px;
                    color: #666;
                    line-height: 22px;
                }
                h1 {
                    position: absolute;
                    margin:0;
                    font-size: 60px;
                    color: #fff;
                    z-index: 2;
                    line-height: 83px;
                    top:30px;
                }
                legend {
                    padding: 10px;      
                    font-family: Roboto, Arial, sans-serif;
                    font-size: 18px;
                    color: #fff;
                    background-color: #1c87c9;
                }
                textarea {
                    width: calc(100% - 12px);
                    padding: 5px;
                }
                .testbox {
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    height: inherit;
                    padding: 20px;
                }
                form {

                    width: 100%;
                    padding: 20px;
                    border-radius: 6px;
                    background: #fff;
                    box-shadow: 0 0 8px #006622; 
                }
                .banner {
                    position: relative;
                    height: 250px;
                    background-image: url("https://www.w3docs.com/uploads/media/default/0001/02/19ea6ba00def11fb8f5113a4d7555a97bd58ce3d.jpeg");  
                    background-size: cover;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    text-align: center;
                }
                .banner::after {
                    content: "";
                    background-color: rgba(0, 0, 0, 0.4); 
                    position: absolute;
                    width: 100%;
                    height: 100%;
                }
                input, select, textarea {
                    margin-bottom: 10px;
                    border: 1px solid #ccc;
                    border-radius: 3px;
                }
                input ,select{
                    width: calc(100% - 10px);
                    padding: 5px;
                }
                input[type="date"] {
                    padding: 4px 5px;
                }
                textarea {
                    width: calc(100% - 12px);
                    padding: 5px;
                }
                .item:hover p, .item:hover i, .question:hover p, .question label:hover, input:hover::placeholder {
                    color:  #006622;
                }
                .checkbox input[type=checkbox] {
                    display:inline-block;
                    height:15px;
                    width:15px;
                    margin-right:5px;
                    vertical-align:text-top;
                }
                .item input:hover, .item select:hover, .item textarea:hover {
                    border: 1px solid transparent;
                    box-shadow: 0 0 3px 0  #006622;
                    color: #006622;
                }
                .item {
                    position: relative;
                    margin: 10px 0;
                }
                .item span {
                    color: red;
                }
                .week {
                    display:flex;
                    justfiy-content:space-between;
                }
                .colums {
                    display:flex;
                    justify-content:space-between;
                    flex-direction:row;
                    flex-wrap:wrap;
                }
                .colums div {
                    width:48%;
                }
                input[type=radio], input[type=checkbox]  {
                    display: none;
                }
                label.radio {
                    position: relative;
                    display: inline-block;
                    margin: 5px 20px 15px 0;
                    cursor: pointer;
                }
                .question span {
                    margin-left: 30px;
                }
                .question-answer label {
                    display: block;
                }
                label.radio:before {
                    content: "";
                    position: relative;
                    left: i0;
                    width: 17px;
                    height: 17px;
                    border-radius: 50%;
                    border: 2px solid #ccc;
                }
                input[type=radio]:checked + label:before, label.radio:hover:before {
                    border: 2px solid  #006622;
                }
                label.radio:after {
                    content: "";
                    position: absolute;
                    top: 6px;
                    left: 5px;
                    width: 8px;
                    height: 4px;
                    border: 3px solid  #006622;
                    border-top: none;
                    border-right: none;
                    transform: rotate(-45deg);
                    opacity: 0;
                }
                input[type=radio]:checked + label:after {
                    opacity: 1;
                }
                .flax {
                    display:flex;
                    justify-content:space-around;
                }
                .btn-block {
                    margin-top: 10px;
                    text-align: center;
                }
                button {
                    width: 150px;
                    padding: 10px;
                    border: none;
                    border-radius: 5px; 
                    background:  #1c87c9;
                    font-size: 16px;
                    color: #fff;
                    cursor: pointer;
                }
                button:hover {
                    background:  #0692e8;
                }
                @media (min-width: 568px) {
                    .name-item, .city-item {
                        display: flex;
                        flex-wrap: wrap;
                        justify-content: space-between;
                    }
                    .name-item input, .name-item div {
                        width: calc(50% - 20px);
                    }
                    .name-item div input {
                        width:97%;}
                    .name-item div label {
                        display:block;
                        padding-bottom:5px;
                    }
                }
            </style>
        </head>
        <body>
            <div class="testbox">
                <form>
                    <div class="banner">
                        <h1>Student Application Form</h1>
                    </div>
                    <br/>
                    <fieldset>
                        <legend>Personal Information</legend>
                        <div class="colums">
                            <div class="item">
                                <label for="fname">First Name<span>*</span></label>
                                <input id="fname" type="text" name="fname" />
                            </div>
                            <div class="item">
                                <label for="lname"> Last Name<span>*</span></label>
                                <input id="lname" type="text" name="lname" />
                            </div>
                            <div class="item">
                                <label for="dob">Date Of Birth<span>*</span></label>
                                <input type="date" name="dob" required/>
                                <!--             <i class="fas fa-calendar-alt"></i>-->
                            </div>
                            <div class="item">
                                <label for="phone">Phone Number<span>*</span></label>
                                <input id="phone" type="tel"   name="phone"/>
                            </div>
                            <div class="item">
                                <label for="citizen">CitizenShip</label>
                                <input id="citizen" type="text"   name="citizen" />
                            </div>
                            <div class="item">
                                <label for="saddress">Ethnicity</label>
                                <input id="saddress" type="text"   name="city" />
                            </div>
                            <div class="item">
                                <label for="gender">Gender: </label>
                                <input type="radio" value="none" id="male" name="gender" checked/>
                                <label for="male" class="radio">Male</label>
                                <input type="radio" value="none" id="female" name="gender" />
                                <label for="female" class="radio">Female</label>
                                <input type="radio" value="none" id="Non-Binary" name="gender" />
                                <label for="Non-Binary" class="radio">Non-Binary</label>
                            </div>

                    </fieldset>
                    <br/>
                    <fieldset>
                        <legend>Current Address</legend>
                        <div class="colums">
                            <div class="item">
                                <label for="addressLIne1">Street Address Line1</label>
                                <input id="addressLIne1" type="text"   name="addressLIne1" />
                            </div>
                            <div class="item">
                                <label for="addressLIne2">Street Address Line2</label>
                                <input id="addressLIne2" type="text"   name="addressLIne2" />
                            </div>
                            <div class="item">
                                <label for="country">Country</label>
                                <!--            <input id="country" type="text"   name="text" />-->
                                <select  id="country"  name="country" >
                                    <option value="">
                                        Select Country </option>
                                </select>
                            </div>
                            <div class="item">
                                <label for="state">State</label>
                                <!--            <input id="state" type="text"   name="state" />-->
                                <select  id="state"  name="state" >
                                    <option value="">
                                        Select State </option>
                                </select>
                            </div>
                            <div class="item">
                                <label for="city">City</label>
                                <input id="city" type="text"   name="city" />
                            </div>
                            <div class="item">
                                <label for="zip">Zip/Postal Code</label>
                                <input id="zip" type="text"   name="zip" />
                            </div>

                    </fieldset>
                    <br/>
                    <fieldset>
                        <legend>Family Details</legend>
                        <div class="colums">
                            <div class="item">
                                <label for="pgOccupation">Primary Guardian Occupation</label>
                                <input id="pgOccupation" type="text"   name="pgOccupation" />
                            </div>
                            <div class="item">
                                <label for="pgPhone">Primary Guardian Contact Number<span>*</span></label>
                                <input id="pgPhone" type="tel"   name="pgPhone"/>
                            </div>
                            <div class="item">
                                <label for="sgOccupation">Secondary Guardian Occupation</label>
                                <input id="sgOccupation" type="text"   name="sgOccupation" />
                            </div>
                            <div class="item">
                                <label for="tIncome">Total Family Income</label>
                                <input id="tIncome" type="text"   name="tIncome" />
                            </div>
                            <div class="item">
                                <label for="tSavings">Total Family Savings</label>
                                <input id="tSavings" type="text"   name="tSavings" />
                            </div>

                    </fieldset>
                    <br/>
                    <fieldset>
                        <legend>Academic Records </legend>
                        <div class="colums">
                            <div class="item">
                                <label for="university">University<span>*</span></label>
                                <br/>
                                <select items ="${requestScope.Unis}"  name="university" id="comboBoxUniversity" >
                                    <c:forEach var= "uni" items ="${requestScope.Unis}">
                                        <option value="${uni.universityID}">
                                            ${uni.name}
                                        </option>

                                    </c:forEach>
                                </select>


                            </div> 

                            <div class="item">
                                <label for="program">Program<span>*</span></label>
<!--                                <input id="program" type="tel"   name="program"/>-->
                                <select   name="program" id="comboboxProgram" >
                                    
                                </select>
                            </div>

                            <div class="item">
                                <label for="year">Year</label>
                                <input type="date" name="year" required/>
                            </div>
                            <div class="item">
                                <label for="takenCredits">Number Of Credits Taken</label>
                                <input id="takenCredits" type="text"   name="takenCredits" />
                            </div>

                            <div class="checkbox">
                                <p>Are you currently pursuing in this Term/semester?</p>
                                <label><input type="checkbox"/>Yes</label>
                            </div>
                            <div class="item">
                                <label for="takenCredits">Obtained GPA if it is a past academic record</label>
                                <input id="takenCredits" type="text"   name="takenCredits" />
                            </div>
                            <div class="item">
                                <label for="maxGPA">Max GPA</label>
                                <input id="maxGPA" type="text"   name="maxGPA" />
                            </div>
                            <div class="item">
                                <label for="startDate">Term Start Date</label>
                                <input type="date" name="startDate" required/>
                            </div>
                            <div class="item">
                                <label for="endDate">Term End Date</label>
                                <input type="date" name="endDate" required/>
                            </div>
                        </div>
                    </fieldset>
                    <br/>

                    <fieldset>
                        <legend>Achievements</legend>
                        <div class="colums">
                            <div class="item">
                                <label for="description">Description<span>*</span></label>
                                <input id="description" type="text"   name="description" />
                            </div>
                            <div class="item">
                                <label for="urlLink">Achievement link If online available<span>*</span></label>
                                <input id="urlLink" type="tel"   name="urlLink"/>
                            </div>
                            <div class="item">
                                <label for="date">Issuing Date</label>
                                <input type="date" name="date" required/>
                            </div>
                            <div class="item">
                                <label for="issuedBy">Issued By</label>
                                <input id="takenCredits" type="text"   name="issuedBy" />
                            </div>
                            <div class="item">
                                <label for="document">Upload Document</label>
                                <input id="document" type="text"   name="document" />
                            </div>


                    </fieldset>
                    <br/>




                    <fieldset>
                        <legend>Student Comments</legend>
                        <div class="colums">
                        </div>

                        <div class="item">
                            <label for="Description">Tell Us More</label>
                            <textarea id=""  name ="Description" rows="3"></textarea>
                        </div>
                    </fieldset>
                    <div class="btn-block">
                        <button type="order" href="/">Submit Application</button>
                    </div>
                    <form>
                        </div>
                        </body>
                        </html>

