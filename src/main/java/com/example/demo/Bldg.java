package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bldg {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String addr;
  private double lat;
  private double lng;
  private float rating;
  private String createdAt;
  private String updatedAt;
  private String deletedAt;

  protected Bldg() {
  }

  public Bldg(double lat, double lng) {
    this.lat = lat;
    this.lng = lng;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public double getLng() {
    return lng;
  }

  public void setLng(double lng) {
    this.lng = lng;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public float getRating() {
    return rating;
  }

  public void setRating(float rating) {
    this.rating = rating;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }

  @Override
  public String toString() {
    return "Bldg [addr=" + addr + ", createdAt=" + createdAt + ", deletedAt=" + deletedAt + ", id=" + id + ", lat="
        + lat + ", lng=" + lng + ", rating=" + rating + ", updatedAt=" + updatedAt + "]";
  }

}