public class BlogPost {

  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost() {
  }

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public static void main(String[] args) {

    BlogPost postOne = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
    BlogPost postTwo = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
    BlogPost postThree = new BlogPost();

    postThree.authorName = "William Turton";
    postThree.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    postThree.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
    postThree.publicationDate = "2017.03.28.";

  }
}