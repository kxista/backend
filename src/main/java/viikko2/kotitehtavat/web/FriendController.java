package viikko2.kotitehtavat.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import viikko2.kotitehtavat.domain.Friend;

@Controller

public class FriendController {

    private static List<Friend> friends = new ArrayList<>();

    static {
        friends.add(new Friend("Minna", "Pellikka"));
        friends.add(new Friend("Tanja", "Bergius"));
        friends.add(new Friend("Jukka", "Juslin"));
    }

    @GetMapping("/friends")
    public String showFriends(Model model) {
        model.addAttribute("friends", friends);
        return "friends";
    }

@GetMapping("/add")
public String addFriendForm() {
    return "add";
}

@PostMapping("/save")
public String saveFriend(Friend friend) {
    friends.add(friend);
    return "redirect:/friends";
}

@GetMapping("/friendsPage")
public String showFriendsPage(Model model) {
    model.addAttribute("friends", friends);
    return "friendsPage";
}

@PostMapping("/savePage")
public String saveFriendPage(Friend friend) {
    friends.add(friend);
    return "redirect:/friendsPage";
}


}

