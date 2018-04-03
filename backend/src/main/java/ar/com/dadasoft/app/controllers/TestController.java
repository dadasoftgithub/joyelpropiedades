package ar.com.dadasoft.app.controllers;

import ar.com.dadasoft.app.entities.Estado;
import ar.com.dadasoft.app.entities.Test;
import ar.com.dadasoft.app.entities.TestDireccion;
import ar.com.dadasoft.app.pojos.TestPojo;
import ar.com.dadasoft.app.services.EstadoService;
import ar.com.dadasoft.app.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;
    @Autowired
    private EstadoService estadoService;

//    @PostMapping(value = "/testsave")
//    public ModelAndView getUsers(@ModelAttribute("test")@Valid Test test){
//
//        ModelAndView model = new ModelAndView("test");
//
//        testService.guardar(test);
//
//        List<Test> tests = testService.listarTests();
//
//        model.addObject("tests", tests);
//
//        return model;
//    }

/*    @PostMapping(value = "/panel/testsave")
    public String saveIt(@RequestBody Test test){

        testService.guardar(test);

        return "It was saved";
    }*/

    @PostMapping(value = "/panel/testsave")
    public String saveIt(@RequestBody TestPojo testPojo){
        Test t = new Test();
        TestDireccion d = new TestDireccion();
        Estado e = estadoService.getEstado(testPojo.getEstado());

        d.setCalle(testPojo.getCalle());
        d.setAltura(testPojo.getAltura());

        t.setEmail(testPojo.getEmail());
        t.setPassword(testPojo.getPassword());
        t.setDireccion(d);
        t.setEstado(e);
        t.setTelefonos(testPojo.getTelefonos());
        t.setDescripcion(testPojo.getDescripcion());

        testService.guardar(t);

        return "It was saved";
    }


    @GetMapping(value = "/panel/testget")
    public List<Test> getIt(){
        return testService.listarTests();
    }


    @GetMapping(value = "/panel/testgetbyid/{id}")
    public Test getById(@PathVariable Long id){
        return testService.getTest(id);
    }


    @PutMapping(value = "/panel/testupdate/{id}")
    public String updateTest(@PathVariable(value = "id") Long id, @Valid @RequestBody TestPojo testPojo){
        boolean rta;

        rta = testService.updateTest(id, testPojo);

        if (rta)
            {return "Test updated";}
        else
            {return "Error updating test";}

    }




    /*
    *
    *
    * public Note updateNote(@PathVariable(value = "id") Long noteId,
                                        @Valid @RequestBody Note noteDetails)
    *    Note note = noteRepository.findById(noteId)
            .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

    note.setTitle(noteDetails.getTitle());
    note.setContent(noteDetails.getContent());

    Note updatedNote = noteRepository.save(note);
    return updatedNote;
    *
    *
    * */




/*

    //@GetMapping(value="/posts")
    public List<Post> posts(){
        return postService.getAllPosts();
    }

    //@GetMapping(value="/the_post/{id}")
    public Post getPostById(@PathVariable Long id){
        return postService.getPost(id);
    }

    @PostMapping(value="/post")
    public String publishPost(@RequestBody Post post){
        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(post.getDateCreated() == null)
            post.setDateCreated(new Date());
        post.setCreator(userService.getUser(userDetails.getUsername()));
        postService.insert(post);
        return "Post was published";
    }

*/


}
