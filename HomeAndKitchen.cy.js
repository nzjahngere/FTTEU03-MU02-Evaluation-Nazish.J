export class HomeAndKitchen {

    getSearch = '#header_search_text'; // Test case 1 - validating search functionality
    clickSearch = 'a[href="javascript:autoSuggestion.headerSearch()"]';

    sortProducts = '#sortByFilter'; // Test case 2 - Sorting products

    getQuickView = '#quickViewId1'; // Test case 3 - Clicking a product and verifying details
    enterPin = '#pincodeDeliveryId_0'; // cy.contains('Check').click();
    moveToRight = '#qv_right_id';
    closeQuickView = '.fancybox-button.fancybox-close-small';

    getProduct1 = '#cpid12611910'; // Test case 4 - Comparing two products
    getProduct2 = '#cpid12613533';
    clickCompare = '.button_1.compareFancyBox';

    // Test case 5 - Applying Filters

    applyCOD = 'iscod';
    applyStock = '#isexoutStock'; // cy.contains('Set').click();

    visitWeb() {
        return cy.visit('https://www.naaptol.com/shop-online/home-kitchen-appliances.html');
    }

    inputSearch(product) {
        return cy.get(this.getSearch).should('exist').and('be.visible').type(product);
    }

    clickSearchh() {
        cy.get(this.clickSearch).should('exist').and('be.visible')
        cy.contains('Mixers & Grinders').click({force: true});
    }

    sortingProducts() {
        return cy.get(this.sortProducts).should('exist').and('be.visible').select('popular');
    }

    getQuickkView() {
        return cy.get(this.getQuickView).click({force: true});
    }

    sendPin(pincode) {
        return cy.get(this.enterPin).should('exist').type(pincode, {force: true});
    }

    moveRight() {
        return cy.get(this.moveToRight).click({force: true});
    }

    closeView() {
        return cy.get(this.closeQuickView).click({force: true});
    }

    compareProd() {
        cy.get(this.getProduct1).should('exist').and('be.visible').check();
    }

    product2() {
        cy.get(this.getProduct2).should('exist').and('be.visible').check();
    }

    clickComparee() {
        return cy.get(this.clickCompare).should('exist').and('be.visible').click();
    }

    applyFilters() {
        cy.get(this.applyCOD).check();
    }

    filters() {
        cy.get(this.applyStock).check();
    }


}