package com.qf.contral;

import com.qf.pojo.Pro;
import com.qf.service.ProSerin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Emp")
public class ProContral {

    @Autowired
    private ProSerin p;

    @RequestMapping("/Pro")
    public String getAll(Model model) {
        model.addAttribute("e", p.getAllpro());
        return "showPro";
    }

    @RequestMapping("/getBypid")
    public String getBypid(HttpServletRequest req, Model model){
        String pid=req.getParameter("pid");
        System.out.println(pid);
        model.addAttribute("p",p.getBypid(pid));

        return "Getbypid";
    }

    @GetMapping("Delete/{pid}")
    public String delete(@PathVariable("pid") String pid) {
        System.out.println(pid);
        if (p.del(pid) > 0) {
            return "redirect:/Emp/Pro";
        }
        return null;
    }

    //@RequestMapping( value = "/update", method = RequestMethod.POST)
    @PostMapping("/UpdateEmp")
    public String update(Pro pro){
        System.out.println("ioi");
        System.out.println(pro);
    p.update(pro);
        return "redirect:/Emp/Pro";
    }
}
