package com.nicolasgandrade.bootcamp.entities;

import java.util.*;

public class Dev {

    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public Dev() {
    }

    public Dev(String name) {
        this.name = name;
    }

    public void subscribeToBootcamp(Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getContentSet());
        bootcamp.getDevs().add(this);
    }

    public void goAhead() {
        Optional<Content> firstContent = this.subscribedContent.stream().findFirst();
        if (firstContent.isPresent()) {
            this.completedContent.add(firstContent.get());
            this.subscribedContent.remove(firstContent.get());
        } else {
            System.err.println("You're not enrolled in any content");
        }
    }

    public double calculateXp() {
        return this.getCompletedContent().stream().mapToDouble(content -> content.calculateXp()).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }

    public void setCompletedContent(Set<Content> completedContent) {
        this.completedContent = completedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(completedContent, dev.completedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, completedContent);
    }
}
