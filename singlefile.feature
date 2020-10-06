Feature: Upload of Single expense receipt

Scenario:

  Given launching application 
  When the user clicks on add symbol button on the expense list
  And the user fills in the Fields like expense name and amount in expense upload page "Hotelexpense" "400"
  Then the user Selects the particular receipt to upload
  
  
  Scenario:
  
  Given the user selects browse option to upload expense receipt and select cancel option
  When user clicks on okay button, expenses details must be updated and the New expenses must be displayed "ISC" "4000"
  And user Edit and delete receipt in expense detail
  And Vendor, Date, Total, Currency selector, Category, Description, Upload section and preview section must be displayed to user "Powercharge" "3000"
  Then the receipt is saved in draft
  
  
  Scenario:
  
  Given the user currently in expense list page and created new expense "innospirebill" "3000"
  When the user can able to view the created receipt by selecting draft filter option and vendor name "SCS"
  And the user can able to view the rejected receipt by selecting filter option
  
  Scenario:
  
  Given User can be able to view the rejected expenses receipt must be displayed the bill must be seen.
  When user clicks on download button, User can be download the rejected bill expenses details 
  And user click on comments button, user can be comment the rejected bill expenses details "May_i_know_reason_for_rejection"
  
  Scenario:
  
  Given User can be able to view the approved expenses receipt must be displayed the bill must be seen.
  When user clicks on download button, User can be download the Approved bill expenses details 
  And user click on comments button, user can be comment the approved bill expenses details "Thanks_for_approving"
  
   Scenario:
  
  Given User can be able to view the uploaded/submitted expenses receipt must be displayed bill in pending approval "UN"
  When user click on comments button, user can be comment the particular uploaded pending approval bill expenses details "please approve soon"
  And  user submitted the expense receipt, if there is any changes or correction in the expense receipt, user can be do the changes in recall button 
  Then The receipt will be moved back to draft and user can able to change the receipt and move directly for approval.
  
  Scenario:
  
  Given user view total no of approved & submitted expenses in userhome page
  When user clicks on draft tab and user should able to views the list of draft expenses in userhome page
  And user clicks on Awaiting approval tab and user should able to views the list of approval expenses in userhome page
  