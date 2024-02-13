package stymsaw.springboot.webapplication1.todos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    private TodoService todoService;


    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("in28minutes");
        model.addAttribute("todos", todos);
        return "listTodos";
    }



    //GET, POST
    @RequestMapping(value="add-todo", method = RequestMethod.GET)
    public String showNewTodoPage() {
        return "todo";
    }


    @RequestMapping(value="add-todo", method = RequestMethod.POST)
//    public String addNewTodo(@RequestParam String description, ModelMap model) {
    public String addNewTodo() {
//        String username = (String)model.get("name");
//        todoService.addTodo(username, description,
//                LocalDate.now().plusYears(1), false);
        return "redirect:list-todos";
    }

}