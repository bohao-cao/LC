package Common;

import org.junit.jupiter.api.Test;

class TitleFormatter {
    @Test
    void calPoints() {

        String title= " Binary Search Tree Iterator";
        title = title.replaceAll("\\s+","");
        title = title.substring(0, 1).toLowerCase() + title.substring(1);
        System.out.println("val = " + title);
    }

}