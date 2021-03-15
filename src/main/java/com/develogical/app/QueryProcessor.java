package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("coleridge")) {
            return "Samuel Taylor Coleridge (21 October 1772 - 25 July 1834) was an " +
                    "English poet, literary critic, philosopher and theologian who, with" +
                    "his friend William Wordsworth, was a founder of the Romantic Movement " +
                    "in England and a member of the Lake Poets.";
        }
        if (query.toLowerCase().contains("byron")){
            return "George Gordon Byron, 6th Baron Byron, FRS (22 January 1788 - 19 April 1824), " +
                    "known simply as Lord Byron, was an English peer, who was a poet and politician. " +
                    "He was one of the leading figures of the Romantic movement and is regarded as " +
                    "one of the greatest English poets.";
        }

        return "";
    }
}
