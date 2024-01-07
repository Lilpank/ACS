package com.study.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.study.models.Dormitories;

import com.study.repos.StudentRepository;
import com.study.repos.RoomRepository;
import com.study.repos.DormitoryRepository;

import com.study.models.Student;
import com.study.models.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;


@Controller
@RequestMapping("/xsl")
public class XslController {

    @Autowired
    private StudentRepository studentService;

    @Autowired
    private RoomRepository roomService;

    @Autowired
    private DormitoryRepository dormService;

    @ResponseBody
    @GetMapping(path = "/student", produces = MediaType.APPLICATION_XML_VALUE)
    private ModelAndView getStudent() throws JsonProcessingException {
        Iterable<Student> list = studentService.findAll();
        return getModelAndView(list, "studentXSL");
    }

    @ResponseBody
    @GetMapping(path = "/room", produces = MediaType.APPLICATION_XML_VALUE)
    public ModelAndView getRoom() throws JsonProcessingException {
        Iterable<Room> list = roomService.findAll();
        return getModelAndView(list, "roomXSL");
    }

    @ResponseBody
    @GetMapping(path = "/dorm", produces = MediaType.APPLICATION_XML_VALUE)
    public ModelAndView get() throws JsonProcessingException {
        Iterable<Dormitories> list = dormService.findAll();
        return getModelAndView(list, "dormXSL");
    }


    private ModelAndView getModelAndView(Iterable<?> list, String viewName) throws JsonProcessingException {
        String str = new XmlMapper().writeValueAsString(list);
        ModelAndView mod = new ModelAndView(viewName);
        Source src = new StreamSource(new StringReader(str));
        mod.addObject("List", src);
        return mod;
    }

}