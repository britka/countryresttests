package ua.brit.models.response.allcountries;

import java.util.List;

/**
 * Created by sbryt on 1/30/2017.
 */
public class ShortCodeCountryResponse {
    private List<String> messages = null;
    private ShortCountryModel result = null;

    public ShortCodeCountryResponse(List<String> messages, ShortCountryModel result) {
        this.messages = messages;
        this.result = result;
    }

    public ShortCodeCountryResponse() {
    }

    public List<String> getMessages() {
        return messages;
    }

    public ShortCodeCountryResponse setMessages(List<String> messages) {
        this.messages = messages;
        return this;
    }

    public ShortCountryModel getResult() {
        return result;
    }

    public ShortCodeCountryResponse setResult(ShortCountryModel result) {
        this.result = result;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShortCodeCountryResponse that = (ShortCodeCountryResponse) o;

        if (getMessages() != null ? !getMessages().equals(that.getMessages()) : that.getMessages() != null)
            return false;
        return getResult() != null ? getResult().equals(that.getResult()) : that.getResult() == null;
    }

    @Override
    public int hashCode() {
        int result1 = getMessages() != null ? getMessages().hashCode() : 0;
        result1 = 31 * result1 + (getResult() != null ? getResult().hashCode() : 0);
        return result1;
    }

    @Override
    public String toString() {
        return "CommonResponse{\n" +
                "messages=" + messages + "\n" +
                ", result=" + result +
                "}\n";
    }
}
