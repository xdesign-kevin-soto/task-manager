package com.createfuture.training.taskmanager.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AddFundsController.class)
public class AddFundsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void addFundsCore_ShouldReturnAddFundsPageWithCoreType() throws Exception {
        mockMvc.perform(get("/add-funds"))
                .andExpect(status().isOk())
                .andExpect(view().name("add-funds"))
                .andExpect(model().attribute("pageTitle", "Add Funds"))
                .andExpect(model().attribute("pageType", "core"));
    }

    @Test
    void addFundsFtd_ShouldReturnAddFundsPageWithFtdType() throws Exception {
        mockMvc.perform(get("/add-funds/ftd"))
                .andExpect(status().isOk())
                .andExpect(view().name("add-funds"))
                .andExpect(model().attribute("pageTitle", "Add Funds - FTD"))
                .andExpect(model().attribute("pageType", "ftd"));
    }

    @Test
    void savedMethods_ShouldReturnSavedMethodsPage() throws Exception {
        mockMvc.perform(get("/add-funds/saved-methods"))
                .andExpect(status().isOk())
                .andExpect(view().name("saved-methods"))
                .andExpect(model().attribute("pageTitle", "Saved Payment Methods"))
                .andExpect(model().attribute("pageType", "saved"));
    }

    @Test
    void onlineBanking_ShouldReturnOnlineBankingDepositPage() throws Exception {
        mockMvc.perform(get("/add-funds/online-banking"))
                .andExpect(status().isOk())
                .andExpect(view().name("online-banking-deposit"))
                .andExpect(model().attribute("pageTitle", "Online Banking Deposit"));
    }
}