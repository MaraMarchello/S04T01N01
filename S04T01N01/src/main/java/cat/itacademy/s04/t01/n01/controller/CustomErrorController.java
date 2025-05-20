package cat.itacademy.s04.t01.n01.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    @ResponseBody
    public String handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        
        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());
            
            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                return "Error 404: Page not found. Please check the URL.";
            } else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return "Error 500: Internal server error.";
            }
        }
        return "An unexpected error occurred. Please try again.";
    }

    public String getErrorPath() {
        return "/error";
    }
} 