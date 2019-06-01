import exception.ExceptionList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class ServerSequence {

    @Autowired
    FindMaximumSequence findMaximumSequence;

    @GetMapping(path = "/sequence-not-recursive", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public double findElemStackServer(@RequestBody ArrayList<Integer> arrayList) throws ExceptionList {
        return findMaximumSequence.findMaximumSequenceStream(arrayList);
    }

    @GetMapping(path = "/sequence-elem-recursive", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public double findElemStackRecursiveServer(@RequestBody ArrayList<Integer> arrayList) throws ExceptionList {
        return findMaximumSequence.recursiveFindMaximumSequence(arrayList);
    }

}