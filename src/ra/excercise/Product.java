package ra.excercise;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Product {
    private String productId;
    private Date created;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void inputData(Scanner scanner) {
        this.productId = inputProductId(scanner);
        this.created = inputCreated(scanner);
    }

    public String inputProductId(Scanner scanner) {
        System.out.println("Nhập vào mã sản phẩm: ");
        do {
            String productId = scanner.nextLine();
            //Kiểm tra là 4 ký tự bắt đầu là C || S || A
//            if (productId.length()!=4 || (!productId.startsWith("C")&&!productId.startsWith("S")&&!productId.startsWith("A")){
//                System.err.println("Mã sản phẩm phải là chuỗi 4 ký tự bắt đầu là C hoặc S hoặc A");
//            }
            String productIdRegex = "[CSA][\\w]{3}";
            //Kiểm tra trùng lặp
            boolean isExist = false;
            for (int i = 0; i < ProductRun.currentIndex; i++) {
                if (ProductRun.arrProduct[i].equals(productId)) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                System.err.println("Mã sản phẩm đã tồn tại, vui lòng nhập lại");
            } else {
                return productId;
            }
        } while (true);
    }

    public Date inputCreated(Scanner scanner) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhập vào ngày tạo:");
        do {
            String strCreated = scanner.nextLine();
            try {
                Date created = sdf.parse(strCreated);
                return created;
            } catch (Exception ex) {
                System.err.println("Ngày tạo không đúng định dạng dd/MM/yyyy, vui lòng nhập lại");
            }
        } while (true);
    }
}
