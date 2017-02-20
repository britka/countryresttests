package ua.brit.models.response.allcountries;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class AllCountriesResponse {

    private List<String> messages = null;
    private List<ShortCountryModel> result = null;

    /**
     * No args constructor for use in serialization
     */
    public AllCountriesResponse() {
    }

    /**
     * @param result
     * @param messages
     */
    public AllCountriesResponse(List<String> messages, List<ShortCountryModel> result) {
        this.messages = messages;
        this.result = result;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public AllCountriesResponse withMessages(List<String> messages) {
        this.messages = messages;
        return this;
    }

    public List<ShortCountryModel> getResult() {
        return result;
    }

    public void setResult(List<ShortCountryModel> result) {
        this.result = result;
    }

    public AllCountriesResponse withResult(List<ShortCountryModel> result) {
        this.result = result;
        return this;
    }

    public int getTotalCountOfObjects() {
        String message = messages.get(1);
        return Integer.parseInt(message.substring(message.indexOf('[') + 1, message.indexOf(']')));
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(messages).append(result).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AllCountriesResponse) == false) {
            return false;
        }
        AllCountriesResponse rhs = ((AllCountriesResponse) other);
        return new EqualsBuilder().append(messages, rhs.messages).append(result, rhs.result).isEquals();
    }

}
