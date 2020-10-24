package pl.codeleak.demos.sbt.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
class HomeController {

    @GetMapping("/")
    String index(Model model) {

        return "index";
    }
    @GetMapping("/index.html")
    String indexindex(Model model) {

        return "index";
    }

    @GetMapping("/web")
    String index1(Model model) {

        return "index_web";
    }
    @GetMapping("/account")
    String account(Model model) {
        return "account";
    }
    @GetMapping("/account_1")
    String account_1(Model model) {
        return "account_1";
    }
    @GetMapping("/accountmsg")
    String accountmsg(Model model) {
        return "accountmsg";
    }
    @GetMapping("/accountst")
    String accountst(Model model) {
         return "accountst";
    }
    @GetMapping("/accountst_1")
    String accountst_1(Model model) {
        return "accountst_1";
    }
    @GetMapping("/accountstatus")
    String accountstatus(Model model) {
        return "accountstatus";
    }
    @GetMapping("/accountstatus_1")
    String accountstatus_1(Model model) {
        return "accountstatus_1";
    }
    @GetMapping("/accountsttr")
    String accountsttr(Model model) {
        return "accountsttr";
    }
    @GetMapping("/accountsttr_1")
    String accountsttr_1(Model model) {
         return "accountsttr_1";
    }
    @GetMapping("/accounttran")
    String accounttran(Model model) {
        return "accounttran";
    }
    @GetMapping("/accounttran_1")
    String accounttran_1(Model model) {
         return "accounttran_1";
    }
//////////////////////////////////////
    @GetMapping("properties")
    @ResponseBody
    java.util.Properties properties() {
        return System.getProperties();
    }

}
