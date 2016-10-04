package uk.gov.ons.json;

public class Summary {

    public String name;
    public String reference;
    public String urn;
    //public String refLink;
    //public String urnLink;
    public String link;

    public Summary() {
        // Default constructor
    }

    public  Summary(Survey survey) {
        name = survey.description.title;
        reference = name.replaceAll("\\B.|\\P{L}", "");
        urn = "urn:uk.gov.ons.surveys:id:survey:" + reference;
        //refLink = "https://sdc-survey-registry-java.herokuapp.com/" + reference;
        //urnLink = "https://sdc-survey-registry-java.herokuapp.com/urn:uk.gov.ons.surveys:id:survey:" + reference;
        link = "/" + reference;
    }
}
