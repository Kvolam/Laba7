
import exception.ExceptionStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Stack;


@RestController
public class ServerStack {

    @Autowired
    FindElemStack findElemStack;

    @GetMapping(path = "/find-elem-not-recursive", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public double findElemStackServer(@RequestBody ReceivedStack receivedStackstack) throws ExceptionStack {
        return findElemStack.findSecondElemSream(receivedStackstack.getStack());
    }

    @GetMapping(path = "/find-elem-recursive", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public double findElemStackRecursiveServer(@RequestBody ReceivedStack receivedStack) throws ExceptionStack {
        return findElemStack.recursiveFindSecondElem(receivedStack.getStack());
    }

}