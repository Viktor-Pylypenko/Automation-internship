package homework.lessons.trello;

import com.thirdparty.trello.TrelloRestClient;
import com.thirdparty.trello.models.Board;
import com.thirdparty.trello.models.Lists;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TrelloApiTests {

    @Test
    public void getLists() throws IOException {
        TrelloRestClient client = new TrelloRestClient();
        List<Lists> body = client.boardService.getLists("mWidMGRM").execute().body();
        body.forEach(modelField -> System.out.println(modelField.name));
    }

    @Test
    public void createBoard() throws IOException {
        TrelloRestClient client = new TrelloRestClient();
        Board board = client.boardService.createBoard("FG_Board").execute().body();
        System.out.println(board.url);
    }
}
