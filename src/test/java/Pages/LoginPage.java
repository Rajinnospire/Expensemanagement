package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.Testbase;

public class LoginPage extends Testbase {
	{
PageFactory.initElements(driver,this);
	   }
   @FindBy(id = "ContentPlaceHolder1_txtEmail")
   private WebElement username;
	
   @FindBy( id ="ContentPlaceHolder1_txtpassword")
   private WebElement password;
   
   @FindBy( id= "ContentPlaceHolder1_btnLogin")
   private WebElement enter;
   
   @FindBy(className= "isc-theme-blue-btn")
   private WebElement Newexpense;
   
   @FindBy( id= "txt_ExpenseName")
   private WebElement Expensename;
   
   
   @FindBy( id= "txt_advance")
   private WebElement advanceamount;
   
   @FindBy( xpath= "(//a[@data-toggle= 'dropdown'] )[2]")
   private WebElement addreceipt;
   
   @FindBy( xpath= "(//a[@data-toggle= 'modal'] )[1]")
   private WebElement singlereceipt;
   
   @FindBy( xpath= "(//input[@type='file'] )[1]")
   private WebElement browseoption;
   
   @FindBy( id= "btn_Cancel")
   private WebElement cancelbtn;
   
   @FindBy( id= "add-reciept")
   private WebElement okbutn;
   
	@FindBy(className="text-center")
	private WebElement scrollDown;
   
   @FindBy( id= "tbl_exp")
   private WebElement preview;
   
   @FindBy( id= "save-expense")
   private WebElement savebtn;
   
   @FindBy(className= "fa fa-trash-o")
   private WebElement deleteicon;
   
   @FindBy(xpath= "(//a[@data-expensename='Powercharge'])[1]")
   private WebElement expensesavebtn;
   
   @FindBy( id= "btn_Submit")
   private WebElement submitbtn;
   
   @FindBy(xpath= "//a[contains(@edit-receipt,'160')]")
   private WebElement Actioneddit;
   
   @FindBy(xpath= "//a[contains(@del-reciept,'160')]")
   private WebElement Actiondelete;
   
   @FindBy(className= "isc-home-par-KPI-in-Con-s1")
   private WebElement Userkpi;
   
   @FindBy( id= "expensesHome")
   private WebElement clickexpense;
   
   @FindBy( xpath= "(//a[@class='isc-theme-blue-btn'] )[2]")
   private WebElement clickNewexpense;
   
   @FindBy( id= "txt_vendor")
   private WebElement selectvendor;
   
   
   @FindBy( id= "slt_status")
   private WebElement choosestatus;
   
   @FindBy(xpath= "//div[@class='isc-filter-search isc-go  mar-lft-10']")
   private WebElement clicksearch;
   
   @FindBy(xpath= "(//a[@data-expensename='innospirebill'])[1]")
   private WebElement viewreceipt;
   
   
   @FindBy(className= "isc-action-badge-td-s1")
   private WebElement viewattachment;
   
   @FindBy(xpath= "(//a[@class='btn blue isc-btn-pop-action-s1'])[3]")
   private WebElement viewedattachment;
   
   @FindBy(xpath= "(//a[@data-editexpense='70292'])[1]")
   private WebElement viewrejectedreceipt;
   
   @FindBy(xpath= "(//a[@class='isc-action-badge-td-s1 '])[1]")
   private WebElement viewedrejattachment;
   
   
   @FindBy(xpath= "(//a[@class='btn blue isc-btn-pop-action-s1'])[2]")
   private WebElement rejreceiptviewed;
   
   @FindBy(xpath= "(//a[@data-downloadexpenseid='70292'])[1]")
   private WebElement downloadrej;
   
   @FindBy(xpath= "(//a[@data-downloadexpenseid='70292'])[2]")
   private WebElement Downloadokbtn;
   
   @FindBy(xpath= "(//a[@data-commentsexpenseid='70292'])[1]")
   private WebElement rejentercomments;
   
   @FindBy( id= "txt_Comments")
   private WebElement commentsentered;
   
   @FindBy( id= "btn_Comment")
   private WebElement comententer;
   
   @FindBy(xpath= "//button[@class='btn default isc-btn-pop-action-s2 btn_Popupcancel']")
   private WebElement submitted;
   
   @FindBy(xpath= "(//a[@data-editexpense='70140'])[1]")
   private WebElement viewapprovedreceipt;
   
   @FindBy(xpath= "(//a[@data-downloadexpenseid='70140'])[1]")
   private WebElement downloadapproved;
   
   @FindBy(xpath= "(//a[@data-downloadexpenseid='70140'])[2]")
   private WebElement Downloadapprovedbtn;
  
   @FindBy(xpath= "(//a[@data-commentsexpenseid='70140'])[1]")
   private WebElement approvedentercomments;
   
   @FindBy(xpath= "(//a[@data-commentsexpenseid='70140'])[2]")
   private WebElement approvedcomententer;
   
   @FindBy(xpath= "(//div[@class='isc-section-header-container'])[1]")
   private WebElement AwaitingApproval;
   
   @FindBy(xpath= "(//a[@data-expensename='Powercharge'])[4]")
   private WebElement Pendingcomments;
   
   @FindBy(xpath= "//a[@id='btn_Comment']")
   private WebElement pendingcomententer;
   
   @FindBy(xpath= "(//a[@data-expensename='Powercharge'])[2]")
   private WebElement recall;
   
   @FindBy(xpath= "(//a[@class='btn blue isc-btn-pop-action-s1'])[5]")
   private WebElement recallokbtn;
   
   @FindBy(xpath= "(//a[@class='isc-action-badge-td-s1'])[23]")
   private WebElement recalledit;
   
   @FindBy(xpath= "(//a[@class='isc-action-badge-td-s1 pad-lft-5'])[1]")
   private WebElement recallEditReceipt;
   
   @FindBy(xpath= "(//a[@class='isc-theme-blue-btn'] )[1]")
   private WebElement Nextbtn;
   
   @FindBy( id= "save-expense-submit")
   private WebElement SaveSubmitBtn;
   
   @FindBy(xpath= "//div[@class='isc-home-par-KPI-in-Con-s1']")
   private WebElement Verifykpi;
   
   
   @FindBy(xpath= "(//div[@class='isc-section-header-container'])[1]")
   private WebElement Draftview;
   
   public WebElement getUsername() {
		return username;
	}
   
 
   public WebElement getPassword() {
		return password;
	}

    public WebElement getEnter() {
		return enter;
	}


    public WebElement getNewexpense() {
		return Newexpense;
	}
	   
	
	public WebElement getExpensename() {
		return Expensename;
		
	}
	
	public WebElement getadvanceamount() {
		return advanceamount;
		
	}
	public WebElement getaddreceipt() {
		return addreceipt;
	}
	
	public WebElement getsinglereceipt() {
		return singlereceipt;
	}
	
	public WebElement getbrowseoption() {
		return browseoption;
	}
	
	public WebElement getcancelbtn() {
		return cancelbtn;
	}
	
	public WebElement getokbutn() {
		return okbutn;
	}
	
	public WebElement getpreview() {
		return preview;
	}
	
	public WebElement getsavebtn() {
		return savebtn;
	}
	
	public WebElement getdeleteicon() {
		return deleteicon;
	}
	
	public WebElement getscrollDown() {
		return scrollDown;
   }
	
	public WebElement getexpensesavebtn() {
		return expensesavebtn;
}
	public WebElement getsubmitbtn() {
		return submitbtn;
}
	
	public WebElement getActioneddit() {
		return Actioneddit;
}

	public WebElement getUserkpi() {
		return submitbtn;
}
	public WebElement getActiondelete() {
		return Actiondelete;
}
	public WebElement getclickexpense() {
		return clickexpense;
}
	
	public WebElement getclickNewexpense() {
		return clickNewexpense;
}
	public WebElement getselectvendor() {
		return selectvendor;
}
	public WebElement getchoosestatus() {
		return choosestatus;
}
	public WebElement getclicksearch() {
		return clicksearch;
}
	public WebElement getviewreceipt() {
		return viewreceipt;
}
	public WebElement getviewattachment() {
		return viewattachment;
}
	public WebElement getviewedattachment() {
		return viewedattachment;
}
	public WebElement getviewrejectedreceipt() {  
		return viewrejectedreceipt;
}
	public WebElement getviewedrejattachment() {
		return viewedrejattachment;
}
	public WebElement getrejreceiptviewed() {
		return rejreceiptviewed;
}
	public WebElement getdownloadrej() {
		return downloadrej;
}
	public WebElement getDownloadokbtn() {
		return Downloadokbtn;
}
	public WebElement getrejentercomments() {
		return rejentercomments;
}
	public WebElement getcommentsentered() {
		return commentsentered;
}
	public WebElement getcomententer() {
		return comententer;
}
	public WebElement getsubmitted() {
		return submitted;
}
	public WebElement getviewapprovedreceipt() {
		return viewapprovedreceipt;
}
	public WebElement getdownloadapproved() {
		return downloadapproved;
}
	public WebElement getDownloadapprovedbtn() {
		return Downloadapprovedbtn;
}
	public WebElement getapprovedentercomments() {
		return approvedentercomments;
}
	public WebElement getapprovedcomententer() {
		return approvedcomententer;
}
	public WebElement getAwaitingApproval() {
		return AwaitingApproval;
}
	public WebElement getPendingcomments() {
		return Pendingcomments;	
}
	public WebElement getpendingcomententer() {
		return pendingcomententer;	
}
	public WebElement getrecall() {
		return recall;	
}
	public WebElement getrecallokbtn() {
		return recallokbtn;	
}
	public WebElement getrecalledit() {
		return recalledit;	
}
	public WebElement getrecallEditReceipt() {
		return recallEditReceipt;	
}
	public WebElement getNextbtn() {
		return Nextbtn;	
}
	public WebElement getSaveSubmitBtn() {
		return SaveSubmitBtn;	
}
	public WebElement getVerifykpi() {
		return Verifykpi;	
}
	public WebElement getDraftview() {
		return Draftview;	
}
}