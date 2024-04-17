package XMLfabric;

import consts.Consts;
import model.Author;
import org.w3c.dom.NodeList;

import static org.w3c.dom.Node.ELEMENT_NODE;

public class FabricAuthor {
    public static Author fabricAuthor(NodeList nodeList){
        Author author = new Author();

        for(int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() != ELEMENT_NODE) continue;
            switch (nodeList.item(i).getNodeName()) {

                case Consts.TAG_NAME_LAST_NAME: {
                    author.setLastName(nodeList.item(i).getTextContent());
                    break;
                }
                case Consts.TAG_NAME_FIRST_NAME: {
                    author.setFirstName(nodeList.item(i).getTextContent());
                    break;
                }
                case Consts.TAG_NAME_NATIONALITY: {
                    author.setNationality(nodeList.item(i).getTextContent());
                    break;
                }
                case Consts.TAG_NAME_YEAR_OF_BIRTH: {
                    author.setYearOfBirth(Integer.parseInt(nodeList.item(i).getTextContent()));
                    break;
                }
                case Consts.TAG_NAME_YEAR_OF_DEATH: {
                    author.setYearOfDeath(Integer.parseInt(nodeList.item(i).getTextContent()));
                    break;
                }

            }

        }
        return author;
    }
}

