
Feature:Java By Kiran offline website automation script

  Scenario Outline: Login to the application
   When user open the browser
   And Hits the given "url" into the browser 
   Then User login page should open 
   When user enter the <username> and <Password> 
   And Click on the login button 
   Then user should display the Dashboard page 
   
   

    Examples: 
      | username           | Password |   
      | "Anu@123gmail.com" | "anu@123"| 
      | "kiran@gmail.com " | "123456 "|
