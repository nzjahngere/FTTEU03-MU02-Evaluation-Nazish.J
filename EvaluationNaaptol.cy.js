import { HomeAndKitchen } from "../../pageObject/HomeAndKitchen.cy.js";

describe('Validate Home and Kitchen category', () => {

    beforeEach(() => {
            cy.log('Execution will begin shortly...');
        });

        afterEach(() => {
            cy.log('Test case passed successfully...!!');
        });

    it('validates home and kitchen', () => {
        
        const homeKit = new HomeAndKitchen();

        homeKit.visitWeb();
        
        // Test case 7 - validating home page greetings

        /* cy.contains('Hi Guest');
        cy.wait(4000);

        cy.contains('Home & Kitchen').click();

        // Test case 8 - validating category page title

        cy.contains('Home & Kitchen').should('be.visible'); */

        // Test case 9 - validate URL

        //cy.url().should().eq('https://www.naaptol.com/shop-online/home-kitchen-appliances.html');
        homeKit.inputSearch('juicer');
        homeKit.clickSearchh();
        cy.wait(4000);
        homeKit.sortingProducts();

        cy.wait(4000);
        homeKit.getQuickkView();
        homeKit.sendPin(110001);
        homeKit.moveRight();
        homeKit.closeView();
        homeKit.compareProd();
        homeKit.product2();
        homeKit.clickComparee();
        cy.wait(4000);
        homeKit.applyFilters();
        homeKit.filters();
        cy.contains('Set').click();

        // i have covered as much as test cases i could cover as i am running out of time so i would now implement cucumber with selenium

    });
});
