package Exercise_04;

import java.util.Date;

public class Delivery {
	public String receiptNumber;
	public String receiptPhone;
	public String receiptAddress;
	public String receiptDate;
	public String receiptTime;
	public int menuPrice;
	public int menuNumber;
	
	public Delivery(String receiptNumber, String receiptPhone, String receiptAddress, String receiptDate
			, String receiptTime, int menuPrice, int menuNumber) {
		this.receiptNumber = receiptNumber;
		this.receiptPhone = receiptPhone;
		this.receiptAddress = receiptAddress;
		this.receiptDate = receiptDate;
		this.receiptTime = receiptTime;
		this.menuPrice = menuPrice;
		this.menuNumber = menuNumber;
	}
	
	public void ShowInfo() {
		System.out.printf("%s로 주문접수된 주문은 주소 %s이고, 주문날짜/시간은 %s/%s입니다. \n", this.receiptNumber, this.receiptAddress, this.receiptDate, this.receiptTime);
		System.out.printf("전화번호는 %s이고, 주문가격은 %d원이며, 메뉴번호는 %d입니다. \n", this.receiptPhone, this.menuPrice, this.menuNumber);
	}
}
