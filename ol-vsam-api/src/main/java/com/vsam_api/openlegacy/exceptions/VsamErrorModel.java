package com.vsam_api.openlegacy.exceptions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.openlegacy.core.error.ErrorModel;

import java.util.Map;

@JsonIgnoreProperties(
    ignoreUnknown = true
)
public class VsamErrorModel extends ErrorModel {

    @Getter
    @Setter
    private String paginationKey;

    @Getter
    @Setter
    private Integer retries;

    public VsamErrorModel() {
    }

    public VsamErrorModel(long timestamp, int status, String error, String exception, Map<String, String> messages, String path, String paginationKey) {
        super(timestamp, status, error, exception, messages, path, (String)null);
        this.paginationKey = paginationKey;
    }

    public VsamErrorModel(long timestamp, int status, String error, String exception, String message, String path, String paginationKey) {
        super(timestamp, status, error, exception, (Map)null, path, message);
        this.paginationKey = paginationKey;
    }

    public VsamErrorModel(long timestamp, int status, String error, String exception, Map<String, String> messages, String path, String paginationKey, String message) {
        super(timestamp, status, error, exception, messages, path, (String)null);
        this.paginationKey = paginationKey;
        this.setMessages(messages);
        this.setMessage(message);
    }

    @JsonIgnore
    @Override
    public Map<String, String> getMessages() {
        return super.getMessages();
    }

    @JsonIgnore
    @Override
    public String getException() {
        return super.getException();
    }

    /*public static class VsamErrorModelBuilder {
        private long timestamp;
        private int status;
        private String error;
        private String exception;
        private boolean messages$set;
        private Map<String, String> messages$value;
        private String path;
        private String paginationKey;

        VsamErrorModelBuilder() {
        }

        public VsamErrorModel.VsamErrorModelBuilder timestamp(final long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public VsamErrorModel.VsamErrorModelBuilder status(final int status) {
            this.status = status;
            return this;
        }

        public VsamErrorModel.VsamErrorModelBuilder error(final String error) {
            this.error = error;
            return this;
        }

        public VsamErrorModel.VsamErrorModelBuilder exception(final String exception) {
            this.exception = exception;
            return this;
        }

        public VsamErrorModel.VsamErrorModelBuilder messages(final Map<String, String> messages) {
            this.messages$value = messages;
            this.messages$set = true;
            return this;
        }

        public VsamErrorModel.VsamErrorModelBuilder path(final String path) {
            this.path = path;
            return this;
        }

        public VsamErrorModel build() {
            Map<String, String> messages$value = this.messages$value;
            if (!this.messages$set) {
                messages$value = VsamErrorModel.$default$messages();
            }

            return new VsamErrorModel(this.timestamp, this.status, this.error, this.exception, messages$value, this.path, this.paginationKey);
        }

        public String toString() {
            return "VsamErrorModel.VsamErrorModelBuilder(timestamp=" + this.timestamp + ", status=" + this.status + ", error=" + this.error + ", exception=" + this.exception + ", messages$value=" + this.messages$value + ", path=" + this.path + ")";
        }
    }

    private static Map<String, String> $default$messages() {
        return new HashMap();
    }

    public static ErrorModelBuilder builder() {
        return new VsamErrorModel.VsamErrorModelBuilder();
    }*/


/*
    public long getTimestamp() {
        return this.timestamp;
    }

    public int getStatus() {
        return this.status;
    }

    public String getError() {
        return this.error;
    }

    public String getException() {
        return this.exception;
    }

    public Map<String, String> getMessages() {
        return this.messages;
    }

    public String getPath() {
        return this.path;
    }

    public void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
    }

    public void setStatus(final int status) {
        this.status = status;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public void setException(final String exception) {
        this.exception = exception;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof org.openlegacy.core.error.ErrorModel)) {
            return false;
        } else {
            org.openlegacy.core.error.ErrorModel other = (org.openlegacy.core.error.ErrorModel)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getTimestamp() != other.getTimestamp()) {
                return false;
            } else if (this.getStatus() != other.getStatus()) {
                return false;
            } else {
                label64: {
                    Object this$error = this.getError();
                    Object other$error = other.getError();
                    if (this$error == null) {
                        if (other$error == null) {
                            break label64;
                        }
                    } else if (this$error.equals(other$error)) {
                        break label64;
                    }

                    return false;
                }

                label57: {
                    Object this$exception = this.getException();
                    Object other$exception = other.getException();
                    if (this$exception == null) {
                        if (other$exception == null) {
                            break label57;
                        }
                    } else if (this$exception.equals(other$exception)) {
                        break label57;
                    }

                    return false;
                }

                Object this$messages = this.getMessages();
                Object other$messages = other.getMessages();
                if (this$messages == null) {
                    if (other$messages != null) {
                        return false;
                    }
                } else if (!this$messages.equals(other$messages)) {
                    return false;
                }

                Object this$path = this.getPath();
                Object other$path = other.getPath();
                if (this$path == null) {
                    if (other$path != null) {
                        return false;
                    }
                } else if (!this$path.equals(other$path)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof org.openlegacy.core.error.ErrorModel;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        long $timestamp = this.getTimestamp();
        int result = result * 59 + (int)($timestamp >>> 32 ^ $timestamp);
        result = result * 59 + this.getStatus();
        Object $error = this.getError();
        result = result * 59 + ($error == null ? 43 : $error.hashCode());
        Object $exception = this.getException();
        result = result * 59 + ($exception == null ? 43 : $exception.hashCode());
        Object $messages = this.getMessages();
        result = result * 59 + ($messages == null ? 43 : $messages.hashCode());
        Object $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        return result;
    }

    public String toString() {
        return "ErrorModel(timestamp=" + this.getTimestamp() + ", status=" + this.getStatus() + ", error=" + this.getError() + ", exception=" + this.getException() + ", messages=" + this.getMessages() + ", path=" + this.getPath() + ")";
    }

    public static class ErrorModelBuilder {
        private long timestamp;
        private int status;
        private String error;
        private String exception;
        private boolean messages$set;
        private Map<String, String> messages$value;
        private String path;

        ErrorModelBuilder() {
        }

        public org.openlegacy.core.error.VsamErrorModel.VsamErrorModelBuilder timestamp(final long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public org.openlegacy.core.error.VsamErrorModel.VsamErrorModelBuilder status(final int status) {
            this.status = status;
            return this;
        }

        public org.openlegacy.core.error.VsamErrorModel.VsamErrorModelBuilder error(final String error) {
            this.error = error;
            return this;
        }

        public org.openlegacy.core.error.VsamErrorModel.VsamErrorModelBuilder exception(final String exception) {
            this.exception = exception;
            return this;
        }

        public org.openlegacy.core.error.VsamErrorModel.VsamErrorModelBuilder messages(final Map<String, String> messages) {
            this.messages$value = messages;
            this.messages$set = true;
            return this;
        }

        public org.openlegacy.core.error.VsamErrorModel.VsamErrorModelBuilder path(final String path) {
            this.path = path;
            return this;
        }

        public org.openlegacy.core.error.ErrorModel build() {
            Map<String, String> messages$value = this.messages$value;
            if (!this.messages$set) {
                messages$value = org.openlegacy.core.error.ErrorModel.$default$messages();
            }

            return new org.openlegacy.core.error.ErrorModel(this.timestamp, this.status, this.error, this.exception, messages$value, this.path);
        }

        public String toString() {
            return "VsamErrorModel.VsamErrorModelBuilder(timestamp=" + this.timestamp + ", status=" + this.status + ", error=" + this.error + ", exception=" + this.exception + ", messages$value=" + this.messages$value + ", path=" + this.path + ")";
        }
    }*/
}
