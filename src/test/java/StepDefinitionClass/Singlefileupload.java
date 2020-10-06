package StepDefinitionClass;




import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Pages.LoginPage;
import baseClass.Testbase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Singlefileupload extends Testbase {

		
		
	public WebDriver driver;
	
	Scenario scenario;
	Select sel;

	public static LoginPage login;
	
	@Before
	public void setup(Scenario scenario) {
		this.scenario = scenario;
		
	}
	
	@After
	
	public void tearDown() {
		
		scenario.write("Finished scenario");
		
		if(scenario.isFailed()) {
		
		
		scenario.embed(((TakesScreenshot) Testbase.driver).getScreenshotAs(OutputType.BYTES),  "image/png");
	
	}
	}
	
	@Given("launching application")
	public void launching_application() {
		

		Testbase.initialization();
		loadURL("https://testing.archarena.com/ExpenseManagement/Login.aspx?rst=true");
		login = new LoginPage();
		fill(login.getUsername(),"plakshman@innospire.com");
		fill(login.getPassword(),"1234");
		click(login.getEnter());


}
	
	@When("the user clicks on add symbol button on the expense list")
	public void the_user_clicks_on_add_symbol_button_on_the_expense_list() {
		login = new LoginPage();
		click(login.getNewexpense());
}
	@And("the user fills in the Fields like expense name and amount in expense upload page {string} {string}")
	public void the_user_fills_in_the_Fields_like_expense_name_and_amount_in_expense_upload_page(String Expensename, String Advanceamount) {
		login = new LoginPage();
		fill(login.getExpensename(),Expensename);
		clear(login.getadvanceamount());
		
		fill(login.getadvanceamount(),Advanceamount);
	}
	
	@Then("the user Selects the particular receipt to upload")
	public void the_user_Selects_the_particular_receipt_to_upload() {
		login = new LoginPage();
		click(login.getaddreceipt());
		click(login.getsinglereceipt());
	}
	
	@Given("the user selects browse option to upload expense receipt and select cancel option")
	public void the_user_selects_browse_option_to_upload_expense_receipt_and_select_cancel_option() {
		login = new LoginPage();
		fill(login.getbrowseoption(),"C:\\Users\\brajkumar\\Desktop\\expense management\\ISC EB Bill July20.pdf");
		click(login.getcancelbtn());
	    refresh();
	}
	
	@When("user clicks on okay button, expenses details must be updated and the New expenses must be displayed {string} {string}")
	public void user_clicks_on_okay_button_expenses_details_must_be_updated_and_the_New_expenses_must_be_displayed(String expense, String amount) {
		login = new LoginPage();
		fill(login.getExpensename(),expense);
		clear(login.getadvanceamount());
		fill(login.getadvanceamount(),amount);
		click(login.getaddreceipt());
		click(login.getsinglereceipt());
		fill(login.getbrowseoption(),"C:\\Users\\brajkumar\\Desktop\\expense management\\ISC EB Bill July20.pdf");
		click(login.getokbutn());
		
	}
	
	@And("user Edit and delete receipt in expense detail")
	public void user_Edit_and_delete_receipt_in_expense_detail() throws InterruptedException {
		login = new LoginPage();
		click(login.getActioneddit());
		fill(login.getbrowseoption(),"C:\\Users\\brajkumar\\Desktop\\expense management\\Invoice Jun-20.jpeg");
		click(login.getokbutn());
		Thread.sleep(3000);
		click(login.getActiondelete());
		refresh();
		
		
		
	}
	
	@And("Vendor, Date, Total, Currency selector, Category, Description, Upload section and preview section must be displayed to user {string} {string}")
	public void vendor_Date_Total_Currency_selector_Category_Description_Upload_section_and_preview_section_must_be_displayed_to_user(String balexpense, String balamount) {
		login = new LoginPage();
		fill(login.getExpensename(),balexpense);
		clear(login.getadvanceamount());
		fill(login.getadvanceamount(),balamount);
		click(login.getaddreceipt());
		click(login.getsinglereceipt());
		fill(login.getbrowseoption(),"C:\\Users\\brajkumar\\Desktop\\expense management\\ISC EB Bill July20.pdf");
		click(login.getokbutn());
		validate(login.getpreview());
	}
		
		
    @Then("the receipt is saved in draft")
	public void the_receipt_is_saved_in_draft() {
		login = new LoginPage();
		click(login.getsavebtn());
		click(login.getAwaitingApproval());
		scrollDown(login.getscrollDown());
	    click(login.getexpensesavebtn());
	    click(login.getsubmitbtn());
	}
	
	
	@Given("the user currently in expense list page and created new expense {string} {string}")
	public void the_user_currently_in_expense_list_page_and_created_new_expense(String iscbill, String iscAdvanceamount)  {
		login = new LoginPage();
		click(login.getclickexpense());
		click(login.getclickNewexpense());
		fill(login.getExpensename(),iscbill);
		clear(login.getadvanceamount());
		fill(login.getadvanceamount(),iscAdvanceamount);
		click(login.getaddreceipt());
		click(login.getsinglereceipt());
		fill(login.getbrowseoption(),"C:\\Users\\brajkumar\\Desktop\\expense management\\Invoice Jun-20.jpeg");
		click(login.getokbutn());
		click(login.getsavebtn());
		
	}
	
	@When("the user can able to view the created receipt by selecting draft filter option and vendor name {string}")
	public void the_user_can_able_to_view_the_created_receipt_by_selecting_draft_filter_option_and_vendor_name(String vendorname)  {
		login = new LoginPage();
		fill(login.getselectvendor(),vendorname);
		sel = new Select(login.getchoosestatus());
		sel.selectByIndex(4);
		click(login.getclicksearch());
		click(login.getviewreceipt());
		click(login.getviewattachment());
		click(login.getviewedattachment());
		click(login.getsavebtn());
		
	
	}
	
	@And("the user can able to view the rejected receipt by selecting filter option")
	public void the_user_can_able_to_view_the_rejected_receipt_by_selecting_filter_option() {
		login = new LoginPage();
		sel = new Select(login.getchoosestatus());
		sel.selectByIndex(3); 
		click(login.getclicksearch());
	}

	@Given("User can be able to view the rejected expenses receipt must be displayed the bill must be seen.")
	public void user_can_be_able_to_view_the_rejected_expenses_receipt_must_be_displayed_the_bill_must_be_seen() {
		login = new LoginPage();
		click(login.getviewrejectedreceipt());
		click(login.getviewedrejattachment());
		click(login.getrejreceiptviewed());
		backward();
		
	}
	
	@When("user clicks on download button, User can be download the rejected bill expenses details")
	public void user_clicks_on_download_button_User_can_be_download_the_rejected_bill_expenses_details() {
		login = new LoginPage();
		sel = new Select(login.getchoosestatus());
		sel.selectByIndex(3); 
		click(login.getclicksearch());
		click(login.getdownloadrej());
		click(login.getDownloadokbtn());
		
	}
	
	@And("user click on comments button, user can be comment the rejected bill expenses details {string}")
	public void user_click_on_comments_button_user_can_be_comment_the_rejected_bill_expenses_details(String Comments) {
		login = new LoginPage();
		sel = new Select(login.getchoosestatus());
		sel.selectByIndex(3); 
		click(login.getclicksearch());
		click(login.getrejentercomments());
		fill(login.getcommentsentered(),Comments);
		click(login.getcomententer());
		click(login.getsubmitted());
	}
	
	@Given("User can be able to view the approved expenses receipt must be displayed the bill must be seen.")
	public void user_can_be_able_to_view_the_approved_expenses_receipt_must_be_displayed_the_bill_must_be_seen() {
		login = new LoginPage();
		sel = new Select(login.getchoosestatus());
		sel.selectByIndex(1); 
		click(login.getclicksearch());
		click(login.getviewapprovedreceipt());
		click(login.getviewedrejattachment());
		click(login.getrejreceiptviewed());
		backward();

	}
	
	@When("user clicks on download button, User can be download the Approved bill expenses details")
	public void user_clicks_on_download_button_User_can_be_download_the_Approved_bill_expenses_details() {
		login = new LoginPage();
		sel = new Select(login.getchoosestatus());
		sel.selectByIndex(1); 
		click(login.getclicksearch());
		click(login.getdownloadapproved());
		click(login.getDownloadapprovedbtn());
	}

	@And("user click on comments button, user can be comment the approved bill expenses details {string}")
	public void user_click_on_comments_button_user_can_be_comment_the_approved_bill_expenses_details(String Comments) {
		login = new LoginPage();
		sel = new Select(login.getchoosestatus());
		sel.selectByIndex(1); 
		click(login.getclicksearch());
		click(login.getapprovedentercomments());
		fill(login.getcommentsentered(),Comments);
		click(login.getapprovedcomententer());
		click(login.getsubmitted());
	}

	@Given("User can be able to view the uploaded\\/submitted expenses receipt must be displayed bill in pending approval {string}")
	public void user_can_be_able_to_view_the_uploaded_submitted_expenses_receipt_must_be_displayed_bill_in_pending_approval(String vendorname) {
	
		login = new LoginPage();
		clear(login.getselectvendor());
		fill(login.getselectvendor(),vendorname);
		sel = new Select(login.getchoosestatus());
		sel.selectByIndex(2);
		click(login.getclicksearch());
		scrollDown(login.getscrollDown());
		click(login.getexpensesavebtn());
		click(login.getviewattachment());
		click(login.getrejreceiptviewed());
		backward();
		
		
}
	
	@When("user click on comments button, user can be comment the particular uploaded pending approval bill expenses details {string}")
	public void user_click_on_comments_button_user_can_be_comment_the_particular_uploaded_pending_approval_bill_expenses_details(String Comments) {
		login = new LoginPage();
		sel = new Select(login.getchoosestatus());
		sel.selectByIndex(2);
		click(login.getclicksearch());
		scrollDown(login.getscrollDown());
		click(login.getPendingcomments());
		fill(login.getcommentsentered(),Comments);
		click(login.getpendingcomententer());
		click(login.getsubmitted());
	}

	@And("user submitted the expense receipt, if there is any changes or correction in the expense receipt, user can be do the changes in recall button")
	public void user_submitted_the_expense_receipt_if_there_is_any_changes_or_correction_in_the_expense_receipt_user_can_be_do_the_changes_in_recall_button() {
		login = new LoginPage();
		click(login.getrecall());
		click(login.getrecallokbtn());
	}
	
	@Then("The receipt will be moved back to draft and user can able to change the receipt and move directly for approval.")
	public void the_receipt_will_be_moved_back_to_draft_and_user_can_able_to_change_the_receipt_and_move_directly_for_approval() {
		login = new LoginPage();
		sel = new Select(login.getchoosestatus());
		sel.selectByIndex(4);
		click(login.getclicksearch());
		click(login.getrecalledit());
		click(login.getrecallEditReceipt());
		fill(login.getbrowseoption(),"C:\\Users\\brajkumar\\Desktop\\expense management\\Innospire Rent Invoice July 20.pdf");
		click(login.getokbutn());
		click(login.getNextbtn());
		click(login.getSaveSubmitBtn());
	}
	
	@Given("user view total no of approved & submitted expenses in userhome page")
	public void user_view_total_no_of_approved_submitted_expenses_in_userhome_page() {
		login = new LoginPage();
		backward();
		validate(login.getVerifykpi());
	}

	@When("user clicks on draft tab and user should able to views the list of draft expenses in userhome page")
	public void user_clicks_on_draft_tab_and_user_should_able_to_views_the_list_of_draft_expenses_in_userhome_page() {
		login = new LoginPage();
		click(login.getDraftview());
		
	}

	@And("user clicks on Awaiting approval tab and user should able to views the list of approval expenses in userhome page")
	public void user_clicks_on_Awaiting_approval_tab_and_user_should_able_to_views_the_list_of_approval_expenses_in_userhome_page() {
		login = new LoginPage();
		click(login.getDraftview());
	}
	



			
}























