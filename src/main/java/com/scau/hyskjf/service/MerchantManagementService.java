package com.scau.hyskjf.service;

import com.scau.hyskjf.pojo.Merchantaccount;
import com.scau.hyskjf.pojo.Merchantdetail;
import com.scau.hyskjf.pojo.MerchantinfoWithBLOBs;

import java.util.List;

public interface MerchantManagementService {

    Merchantdetail setRecommend(int id);

    List<MerchantinfoWithBLOBs> findAllMerchant();

    MerchantinfoWithBLOBs findMerchantById(int id);

    List<Merchantaccount>  findMerchantAccountsById(int id);

    Merchantaccount findMerchantAccountById(int id);

    void forbidMerchantAccounts(int merid);

    void enableMerchantAccounts(int merid);

    Merchantdetail setUnrecommend(int id);

    Merchantdetail setIndex(int id);

    Merchantdetail setNotIndex(int id);
}
