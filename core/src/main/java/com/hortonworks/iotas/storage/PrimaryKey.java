package com.hortonworks.iotas.storage;

import com.hortonworks.iotas.common.Schema;

import java.util.Map;

public class PrimaryKey {

    private Map<Schema.Field, Object> fieldsToVal;

    public PrimaryKey(Map<Schema.Field, Object> fieldsToVal) {
        this.fieldsToVal = fieldsToVal;
    }

    @Override
    public String toString() {
        return "StorableId{" +
                "fieldsToVal=" + fieldsToVal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrimaryKey)) return false;

        PrimaryKey that = (PrimaryKey) o;

        return fieldsToVal.equals(that.fieldsToVal);

    }

    @Override
    public int hashCode() {
        return fieldsToVal.hashCode();
    }

    public Map<Schema.Field, Object> getFieldsToVal() {
        return fieldsToVal;
    }
}