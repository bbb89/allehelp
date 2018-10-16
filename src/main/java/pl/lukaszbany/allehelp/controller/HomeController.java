package pl.lukaszbany.allehelp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lukaszbany.allehelp.domain.Item;
import pl.lukaszbany.allehelp.repository.ItemRepository;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HomeController {

    @Resource
    private ItemRepository itemRepository;

    @RequestMapping("/items")
    public List<Item> home() {
        return itemRepository.findAll();
    }
}
