package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.message.InputMessage;

public class InputView {
    public String getLottoPurchaseAmount() {
        System.out.println(InputMessage.INPUT_PURCHASE_AMOUNT.getMessage());

        return Console.readLine();
    }
}
