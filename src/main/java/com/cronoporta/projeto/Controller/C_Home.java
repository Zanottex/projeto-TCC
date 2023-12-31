package com.cronoporta.projeto.Controller;

import com.cronoporta.projeto.Model.M_Resposta;
import com.cronoporta.projeto.Service.S_Reserva;
import com.cronoporta.projeto.Service.S_ReservaSema;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.time.LocalDateTime;

@Controller
@SessionAttributes("usuario")
public class C_Home {

    @GetMapping("/home")
    public String home(HttpSession session, Model model) {
        if (session.getAttribute("usuario") != null) {
            model.addAttribute("usuario",session.getAttribute("usuario"));
            model.addAttribute("reservas",S_Reserva.listReservas());
            return "Home/home";
        } else {
            // A sessão não existe, redirecionar para a página de login
            return "redirect:/";
        }
    }
    @PostMapping("/Reserva")
    @ResponseBody
    public M_Resposta processReserva(
                                 @RequestParam("horarioE") LocalDateTime data_abertura,
                                 @RequestParam("horarioS") LocalDateTime data_fechamento,
                                 @RequestParam("sala") int sala,
                                 HttpSession session
                                 ) {
        if(session.getAttribute("usuario") != null) {
            return S_Reserva.reservas(sala,data_abertura,data_fechamento);
        }
        return null;
    }

    @PostMapping("/ReservaSema")
    @ResponseBody
    public M_Resposta processReservaSema(
            @RequestParam("horarioESema") Time data_abertura,
            @RequestParam("horarioSSema") Time data_fechamento,
            @RequestParam("data_ini") LocalDateTime data_ini,
            @RequestParam("data_fim") LocalDateTime data_fim,
            @RequestParam("salaSema") int sala,
            @RequestParam("segunda") boolean segunda,
            @RequestParam("terça") boolean terca,
            @RequestParam("quarta") boolean quarta,
            @RequestParam("quinta") boolean quinta,
            @RequestParam("sexta") boolean sexta,
            @RequestParam("sabado") boolean sabado,
            @RequestParam("domingo") boolean domingo,
            HttpSession session
    ) {
        if(session.getAttribute("usuario") != null) {
            return S_ReservaSema.reservasSema(sala,segunda, terca, quarta, quinta,sexta,sabado,domingo,data_abertura,data_fechamento, data_ini, data_fim);
        }
        return null;
    }





}
